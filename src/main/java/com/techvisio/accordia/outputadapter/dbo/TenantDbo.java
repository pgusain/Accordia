package com.techvisio.accordia.outputadapter.dbo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Builder
@Data
@Table(name = "tenants")
public class TenantDbo {
    @Id
    private Long id;
    private String code;
    private String description;
    private boolean isActive;
    private String createdBy;
    private String updatedBy;
    private Date createdAt;
    private Date updatedAt;
}
