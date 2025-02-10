package com.abha.sharedlibrary.shared.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Gender {
    M("Male"),
    F("Female"),
    T("Transgender"),
    NTS("Not to say");

    private final String value;
}
