package com.abha.sharedlibrary.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum representing different plan cycles.
 * Each plan cycle is associated with a descriptive value.
 */
@AllArgsConstructor
@Getter
public enum PlanCycle {
  MONTHLY("Monthly"),
  QUARTERLY("Quarterly"),
  HALF_YEARLY("Half Yearly"),
  YEARLY("Yearly");

  private final String value;
}
