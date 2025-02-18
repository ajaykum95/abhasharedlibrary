package com.abha.sharedlibrary.enms.request;

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
public class SendNotificationRequest {
  private SmsMetadata smsInfo;
  private WhatsappMetadata whatsappInfo;
  private EmailMetadata emailInfo;
  private String preferredLanguage;
  private Integer customerId;
  private String notificationType;
  private String createdBy;
}
