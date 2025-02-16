package com.abha.sharedlibrary.shared.common;

import com.abha.sharedlibrary.exceptions.AbhaBaseRunTimeException;
import com.abha.sharedlibrary.exceptions.BaseResponseError;
import com.abha.sharedlibrary.exceptions.BusinessExceptionDefintion;
import java.util.List;

public final class ExceptionUtil {
    private ExceptionUtil() {
    }
    public static AbhaBaseRunTimeException buildException(
        BusinessExceptionDefintion exception, Object... msgParams) {
        var error = BaseResponseError.builder()
                .businessErrorCode(exception.getBusinessErrorCode())
                .exType(exception.getExceptionType())
                .errorMessage(String.format(exception.getErrorMessage(), msgParams))
                .errorCategory(exception.getErrorCategory())
                .build();
        return AbhaBaseRunTimeException.builder()
                .addError(error)
                .build();
    }

    public static AbhaBaseRunTimeException buildException(
        BusinessExceptionDefintion exception, List<BaseResponseError> baseResponseErrors, Object... msgParams) {
        return AbhaBaseRunTimeException.builder()
            .setBusinessErrorCode(exception.getBusinessErrorCode())
            .setExceptionType(exception.getExceptionType())
            .setErrorMessage(String.format(exception.getErrorMessage(), msgParams))
            .addAllError(baseResponseErrors)
            .build();
    }
}
