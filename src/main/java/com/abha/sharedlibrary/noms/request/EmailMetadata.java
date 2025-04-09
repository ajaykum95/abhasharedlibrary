package com.abha.sharedlibrary.noms.request;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailMetadata {
  private Integer domsTemplateId;
  private String domsDocId;
  private String domsVersionDocId;
  private String parameterMap;
  private String sendFrom;
  private String sendTo;
  private String ccList;
  private String bccList;
  private List<NotificationAttachment> attachments;
}

