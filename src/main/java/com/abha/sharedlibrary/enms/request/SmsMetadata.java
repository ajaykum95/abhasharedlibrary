package com.abha.sharedlibrary.enms.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmsMetadata {
  private Integer domsTemplateId;
  private String domsDocId;
  private String parameterMap;
  private String sendFrom;
  private String sendTo;
}
