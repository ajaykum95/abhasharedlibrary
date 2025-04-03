package com.abha.sharedlibrary.enms.request;

import com.abha.sharedlibrary.shared.common.request.PaginationRequest;
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
public class LeadSearchFilter {
    private PaginationRequest paginationRequest;
    private String companyName;
    private String leadStatus;
}
