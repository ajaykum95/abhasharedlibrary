package com.abha.sharedlibrary.enms.response;

import com.abha.sharedlibrary.shared.common.response.PaginationResponse;
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
public class LeadResponseData {
  private List<LeadResponse> leadResponseList;
  private PaginationResponse paginationResponse;
}
