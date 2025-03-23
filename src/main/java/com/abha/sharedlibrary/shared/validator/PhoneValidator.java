package com.abha.sharedlibrary.shared.validator;

import java.util.Objects;

public class PhoneValidator {

  public static boolean isValidPhone(String phone) {
    if (Objects.isNull(phone) || phone.length() < 10) {
      return false;
    }
    return true;
  }
}
