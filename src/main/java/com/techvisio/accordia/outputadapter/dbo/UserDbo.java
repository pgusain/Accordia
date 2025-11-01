package com.techvisio.accordia.outputadapter.dbo;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Builder
@Data
@Table(name = "users")
public class UserDbo {
    @Id
    private Long id;
    private String tenantId;
    private String username;
    private String email;
    private char[] passwordHash;
    private boolean isActive;
    private String createdBy;
    private String updatedBy;
    private Date createdAt;
    private Date updatedAt;
}
