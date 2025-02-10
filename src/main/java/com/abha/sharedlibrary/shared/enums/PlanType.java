package com.abha.sharedlibrary.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

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
