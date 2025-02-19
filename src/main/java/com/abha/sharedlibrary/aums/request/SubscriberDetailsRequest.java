package com.abha.sharedlibrary.aums.request;

import com.abha.sharedlibrary.shared.enums.Industry;
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
public class SubscriberDetailsRequest {
  private String phone;
  private String reference;
  private String companyName;
  private String website;
  private String companySize;
  private String salesTeamSize;
  private Industry industry;
  private List<Integer> crmPriorityIds;
}
