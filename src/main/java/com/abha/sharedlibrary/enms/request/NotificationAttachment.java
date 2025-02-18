package com.abha.sharedlibrary.enms.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationAttachment {
  private String domsId;
  private String domsVersionId;
  private String documentUrl;
  private String fileName;
  private String fileType;
}
