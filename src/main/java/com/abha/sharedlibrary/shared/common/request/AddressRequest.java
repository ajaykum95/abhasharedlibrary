package com.abha.sharedlibrary.shared.common.request;

import com.abha.sharedlibrary.shared.enums.AddressType;
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
public class AddressRequest {
  private AddressType addressType;
  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private String zipcode;
  private String country;
  private boolean isPrimary;
}
