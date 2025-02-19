package com.abha.sharedlibrary.enms.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Language {
  EN("English"),
  HI("Hindi");

  private final String value;
}
