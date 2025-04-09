package com.abha.sharedlibrary.noms.request;

import com.abha.sharedlibrary.enms.enums.Language;
import com.abha.sharedlibrary.enms.enums.NotificationType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SendNotificationRequest {
  private SmsMetadata smsInfo;
  private WhatsappMetadata whatsappInfo;
  private EmailMetadata emailInfo;
  private Language preferredLanguage;
  private Long customerId;
  private NotificationType notificationType;
  private String createdBy;
}
