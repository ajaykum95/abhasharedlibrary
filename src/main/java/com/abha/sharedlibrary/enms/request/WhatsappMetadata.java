package com.abha.sharedlibrary.enms.request;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WhatsappMetadata {
  private Integer domsTemplateId;
  private String domsDocId;
  private String domsVersionDocId;
  private String parameterMap;
  private String sendFrom;
  private String sendTo;
  private String msgHeader;
  private String footer;
  private String appendPost;
  private Boolean isTemplate;
  private NotificationAttachment attachment;
}
