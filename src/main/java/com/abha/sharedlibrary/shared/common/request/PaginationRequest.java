package com.abha.sharedlibrary.shared.common.request;

import com.abha.sharedlibrary.shared.enums.SortOrder;
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
    private SortOrder sortOrder;
}
