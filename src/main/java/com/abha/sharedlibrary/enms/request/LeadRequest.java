package com.abha.sharedlibrary.enms.request;

import com.abha.sharedlibrary.shared.common.request.AddressRequest;
import java.util.List;
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
public class LeadRequest {
  private String name;
  private String url;
  private String description;
  private String leadStatus;
  private List<ContactRequest> contacts;
  private List<CustomRequest> customRequests;
  private List<AddressRequest> addresses;
  private String source;
}
