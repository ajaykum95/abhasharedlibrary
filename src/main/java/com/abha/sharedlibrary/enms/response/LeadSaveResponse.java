package com.abha.sharedlibrary.enms.response;

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
public class LeadSaveResponse {
  private Long leadId;
  private boolean success;
  private String message;
}
