package com.techvisio.accordia.outputadapter;

import com.techvisio.accordia.outputadapter.dbo.TenantDbo;
import com.techvisio.accordia.outputadapter.dbo.UserDbo;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantDbAdapter extends R2dbcRepository<TenantDbo, Long> {
    // Add custom query methods if needed, e.g.:
    // Flux<WorkItemEntity> findByStatus(String status);
}
