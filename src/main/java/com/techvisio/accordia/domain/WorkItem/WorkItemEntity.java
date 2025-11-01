package com.techvisio.accordia.domain.WorkItem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkItemEntity {
    private Long id;
    private Long customerId;
    private String jobTitle;
    private String description;
    private String status;
    private String createdBy;
    private String updatedBy;
}
