package com.abha.sharedlibrary.exceptions;

import lombok.Builder;

/**
 * @field businessErrorCode - Represent business specific error case.
 * @field errorMessage - Detail error message.
 * @field errorStack - (Optional) Error trace stack. Usually not prefered to
 *        share out of service boundry.
 **/
@Builder
public final record BaseResponseError(int businessErrorCode, ErrorCategory errorCategory, String errorMessage,
        String errorStack, ExceptionTypes exType) {
}
