package com.abha.sharedlibrary.aums.request;

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
public class SubscriptionUpgradeReq {
  private Long subscriberId;
  private Long subscriptionPlanId;
  private Long paymentEntityId;
}
