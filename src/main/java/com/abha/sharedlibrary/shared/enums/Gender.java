package com.abha.sharedlibrary.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum representing different gender identities.
 * Each gender type is associated with a corresponding descriptive value.
 */
@AllArgsConstructor
@Getter
public enum Gender {
  M("Male"),
  F("Female"),
  T("Transgender"),
  NTS("Not to say");

  private final String value;
}
