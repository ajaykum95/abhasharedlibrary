package com.abha.sharedlibrary.pams.response;

import com.abha.sharedlibrary.pams.enums.EntityType;
import com.abha.sharedlibrary.pams.enums.ShortExcessType;
import java.time.ZonedDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentInfo {
  private Long entityId;
  private EntityType entityType;
  private double amount;
  private double tdsAmount;
  private ShortExcessType excessType;
  private double shortAccessAmount;
  private ZonedDateTime dateTime;
  private String comment;
}
