package com.abha.sharedlibrary.pams.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentInfoRequest {
  private Long id;
  private Long entityId;
  private Long subscriberId;
}
