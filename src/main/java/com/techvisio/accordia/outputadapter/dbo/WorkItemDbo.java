package com.techvisio.accordia.outputadapter.dbo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table(name = "work_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkItemDbo {
    @Id
    private Long id;

    private Long customerId;
    private String jobTitle;
    private String description;
    private String status;

    private String createdBy;
    private String updatedBy;
}

