package com.techvisio.accordia.outputadapter;

import com.techvisio.accordia.outputadapter.dbo.CustomerDbo;
import com.techvisio.accordia.outputadapter.dbo.WorkItemDbo;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDbAdapter extends R2dbcRepository<CustomerDbo, Long> {
    // Add custom query methods if needed, e.g.:
    // Flux<WorkItemEntity> findByStatus(String status);
}
