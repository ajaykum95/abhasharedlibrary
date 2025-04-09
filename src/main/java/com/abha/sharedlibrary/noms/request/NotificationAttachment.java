package com.abha.sharedlibrary.noms.request;

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
