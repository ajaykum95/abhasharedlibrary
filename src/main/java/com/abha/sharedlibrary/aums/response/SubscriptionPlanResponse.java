package com.abha.sharedlibrary.aums.response;

import com.abha.sharedlibrary.shared.enums.PlanCycle;
import com.abha.sharedlibrary.shared.enums.PlanType;
import java.util.List;
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
public class SubscriptionPlanResponse {
    private Long id;
    private PlanType planType;
    private double price;
    private String description;
    private PlanCycle planCycle;
    private List<PlanFeatureResponse> planFeatureResponses;
}
