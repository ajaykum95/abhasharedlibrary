package com.abha.sharedlibrary.enms.request;

import com.abha.sharedlibrary.enms.enums.ContactType;
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
public class ContactTypeRequest {
  private ContactType contactType;
  private String value;
}
