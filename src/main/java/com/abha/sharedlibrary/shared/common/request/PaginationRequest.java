package com.abha.sharedlibrary.shared.common.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaginationRequest {
    private int pageNumber;
    private int pageSize;
    private String orderByColumn;
    private String sortBy;
}
