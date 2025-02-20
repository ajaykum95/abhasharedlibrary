package com.abha.sharedlibrary.pams.response;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentInfoResponse {
  private Long id;
  private Long subscriptionId;
  private List<PaymentInfo> paymentInfo;
}
