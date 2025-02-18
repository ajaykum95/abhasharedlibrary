package com.abha.sharedlibrary.shared.common;

import com.abha.sharedlibrary.shared.constants.AppConstant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import lombok.experimental.UtilityClass;

/**
 * Utility class containing helper methods.
 * This class is marked with {@code @UtilityClass}, which means:
 * - It cannot be instantiated.
 * - All methods must be static.
 * - The compiler will automatically make the constructor private.
 *
 */
@UtilityClass
public class Utils {

  public ZonedDateTime getDatePlusDays(int days) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(AppConstant.ASIA_KOLKATA));
    if (days > 0) {
      return zonedDateTime.plusDays(days);
    }
    return zonedDateTime;
  }
}
