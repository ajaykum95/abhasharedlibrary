package com.abha.sharedlibrary.aums.response;

import com.abha.sharedlibrary.shared.enums.FeatureType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PlanFeatureResponse {
    private Long id;
    private FeatureType featureType;
    private int featureValue;
    private String featureDescription;
}
