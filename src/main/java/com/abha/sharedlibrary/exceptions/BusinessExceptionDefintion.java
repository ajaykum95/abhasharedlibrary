package com.abha.sharedlibrary.exceptions;

/**
 * Definition for enums to pre-define exceptions for service.
 */
public interface BusinessExceptionDefintion {
  /**
   * should return business error code of exception.
   */
  int getBusinessErrorCode();

  /**
   * should return {@link ErrorCategory} of exception.
   */
  ErrorCategory getErrorCategory();

  /**
   * should return {@link ExceptionTypes} of exception.
   */
  ExceptionTypes getExceptionType();

  /**
   * should return error message of exception.
   */
  String getErrorMessage();
}
