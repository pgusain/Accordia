package com.techvisio.accordia.outputadapter;

import com.techvisio.accordia.outputadapter.dbo.WorkItemDbo;
import org.springframework.stereotype.Repository;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

@Repository
public interface WorkItemDbAdapter extends R2dbcRepository<WorkItemDbo, String> {
    // Add custom query methods if needed, e.g.:
    // Flux<WorkItemEntity> findByStatus(String status);
}
