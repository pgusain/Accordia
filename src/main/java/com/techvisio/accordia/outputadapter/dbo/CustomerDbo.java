package com.techvisio.accordia.outputadapter.dbo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Builder
@Data
@Table(name = "customers")
public class CustomerDbo {
    @Id
    private Long id;
    private String tenantId;
    private boolean isActive;
    private String createdBy;
    private String updatedBy;
    private Date createdAt;
    private Date updatedAt;
}
