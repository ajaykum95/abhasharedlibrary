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
public class LeadResponse {
  private Long id;
  private String companyName;
  private String leadStatus;
  private String contactName;
  private String emailAddress;
  private String phoneNumber;
}
