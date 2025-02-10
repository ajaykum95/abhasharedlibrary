package com.abha.sharedlibrary.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PlanCycle {
    MONTHLY("Monthly"),
    QUARTERLY("Quarterly"),
    HALF_YEARLY("Half Yearly"),
    YEARLY("Yearly");

    private final String value;
}
