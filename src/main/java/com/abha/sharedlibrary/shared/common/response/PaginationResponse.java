package com.abha.sharedlibrary.shared.common.response;

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
public class PaginationResponse {
  private int pageNumber;
  private int pageSize;
  private long totalCount;
}
