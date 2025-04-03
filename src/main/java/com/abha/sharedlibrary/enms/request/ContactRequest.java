package com.abha.sharedlibrary.enms.request;

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
public class ContactRequest {
  private String name;
  private String title;
  private String url;
  private boolean isPrimary;
  private List<ContactTypeRequest> contactDetails;
}
