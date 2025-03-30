package com.abha.sharedlibrary.shared.common;

import com.abha.sharedlibrary.shared.annotations.ExcelHeader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Slf4j
public class ExcelFileUtil {
  private static final String DEFAULT_SHEET_NAME = "Sheet1";

  public static <T> XSSFWorkbook createExcel(List<T> dataList, String fileName, String sheetName) {
    if (CollectionUtils.isEmpty(dataList)) {
      throw new RuntimeException("Data list can not be empty!");
    }

    XSSFWorkbook workbook = new XSSFWorkbook();
    Sheet sheet =
        workbook.createSheet(Objects.nonNull(sheetName) ? sheetName : DEFAULT_SHEET_NAME);
    Row headerRow = sheet.createRow(0);

    Class<?> classType = dataList.get(0).getClass();

    List<Field> excelFields = Arrays.stream(classType.getDeclaredFields())
        .filter(field -> field.isAnnotationPresent(ExcelHeader.class))
        .sorted(Comparator.comparingInt(field -> field.getAnnotation(ExcelHeader.class).columnIndex()))
        .toList();

    for (int i = 0; i < excelFields.size(); i++) {
      ExcelHeader header = excelFields.get(i).getAnnotation(ExcelHeader.class);
      headerRow.createCell(i).setCellValue(header.headerName());
    }

    int rowNum = 1;
    for (T data : dataList) {
      Row row = sheet.createRow(rowNum++);
      for (int i = 0; i < excelFields.size(); i++) {
        Field field = excelFields.get(i);
        field.setAccessible(true);
        try {
          Object value = field.get(data);
          setCellValue(workbook, row.createCell(i), value);
        } catch (Exception e) {
          log.error("Cannot access field value. Error occurred for file: {}", fileName, e);
          throw new RuntimeException("Cannot access field value. Error occurred");
        }
      }
    }
    return workbook;
  }

  private static void setCellValue(XSSFWorkbook workbook, Cell cell, Object value) {
    if (Objects.isNull(value)) {
      cell.setBlank();
      return;
    }
    if (value instanceof Integer) {
      cell.setCellValue((Integer) value);
    } else if (value instanceof Double) {
      cell.setCellValue((Double) value);
    } else if (value instanceof Long) {
      cell.setCellValue((Long) value);
    } else if (value instanceof Boolean) {
      cell.setCellValue((Boolean) value);
    } else if (value instanceof Date) {
      XSSFCellStyle cellStyle = workbook.createCellStyle();
      XSSFDataFormat dateFormat = workbook.createDataFormat();
      cellStyle.setDataFormat(dateFormat.getFormat("yyyy-MM-dd"));
      cell.setCellStyle(cellStyle);
      cell.setCellValue((Date) value);
    } else {
      cell.setCellValue(value.toString());
    }
  }

  public static <T> List<T> readExcel(InputStream inputStream, Class<T> dtoClass) {
    List<T> dataList = new ArrayList<>();
    try (Workbook workbook = new XSSFWorkbook(inputStream)) {
      Sheet sheet = workbook.getSheetAt(0); // Read first sheet
      Iterator<Row> rowIterator = sheet.iterator();
      if (!rowIterator.hasNext()) {
        throw new RuntimeException("Empty Excel file!");
      }

      // Read Header Row and map column indexes to field names
      Row headerRow = rowIterator.next();
      Map<Integer, Field> fieldMap = getFieldMapping(headerRow, dtoClass);

      // Read Data Rows
      while (rowIterator.hasNext()) {
        Row row = rowIterator.next();
        Map<Integer, String> rowValues = new HashMap<>();

        // Read all cell values as strings
        for (Map.Entry<Integer, Field> entry : fieldMap.entrySet()) {
          int columnIndex = entry.getKey();
          Cell cell = row.getCell(columnIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
          String value = getCellValue(cell).trim();
          rowValues.put(columnIndex, value);
        }

        // Skip row if all values are empty
        if (isEmptyRow(rowValues)) {
          continue;
        }

        // Map values to DTO
        T dto = dtoClass.getDeclaredConstructor().newInstance();
        for (Map.Entry<Integer, Field> entry : fieldMap.entrySet()) {
          int columnIndex = entry.getKey();
          Field field = entry.getValue();
          field.setAccessible(true);
          field.set(dto, rowValues.get(columnIndex));
        }
        dataList.add(dto);
      }
    } catch (Exception e) {
      log.error("Error reading Excel file", e);
      throw new RuntimeException("Failed to read Excel file", e);
    } finally {
      try {
        inputStream.close();
      } catch (IOException e) {
        log.error("Error closing input stream: {}", ExceptionUtils.getStackTrace(e));
      }
    }
    return dataList;
  }

  /**
   * Maps Excel column headers to DTO fields using @ExcelHeader annotation.
   */
  private static <T> Map<Integer, Field> getFieldMapping(Row headerRow, Class<T> dtoClass) {
    Map<Integer, Field> fieldMap = new HashMap<>();
    Map<String, Field> annotatedFields = new HashMap<>();

    for (Field field : dtoClass.getDeclaredFields()) {
      if (field.isAnnotationPresent(ExcelHeader.class)) {
        ExcelHeader header = field.getAnnotation(ExcelHeader.class);
        field.setAccessible(true);
        annotatedFields.put(header.headerName().trim(), field);
      }
    }

    for (Cell cell : headerRow) {
      String headerValue = cell.getStringCellValue().trim();
      if (annotatedFields.containsKey(headerValue)) {
        fieldMap.put(cell.getColumnIndex(), annotatedFields.get(headerValue));
      }
    }
    return fieldMap;
  }

  /**
   * Reads a cell value as a string, ensuring numeric values are properly converted.
   */
  private static String getCellValue(Cell cell) {
    if (cell == null) {
      return "";
    }
    // Convert numeric values to string without scientific notation
    return switch (cell.getCellType()) {
      case STRING -> cell.getStringCellValue();
      case NUMERIC -> {
        if (DateUtil.isCellDateFormatted(cell)) {
          yield cell.getDateCellValue().toString();
        }
        yield String.valueOf(
            (long) cell.getNumericCellValue());
      }
      case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
      case FORMULA -> cell.getCellFormula();
      default -> "";
    };
  }

  /**
   * Checks if a row is empty by ensuring all values are blank.
   */
  private static boolean isEmptyRow(Map<Integer, String> rowValues) {
    return rowValues.values().stream().allMatch(String::isEmpty);
  }
}
