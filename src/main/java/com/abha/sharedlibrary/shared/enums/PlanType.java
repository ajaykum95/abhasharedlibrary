package com.abha.sharedlibrary.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum representing different types of plans available in the application.
 * Each plan type is associated with a descriptive value.
 */
@AllArgsConstructor
@Getter
public enum PlanType {
  TRIAL("Trial"),
  BASIC("Basic"),
  STARTUP("Startup"),
  PROFESSIONAL("Professional"),
  ENTERPRISE("Enterprise");

  private final String value;
}
