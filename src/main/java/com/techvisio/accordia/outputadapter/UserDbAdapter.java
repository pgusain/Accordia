package com.techvisio.accordia.outputadapter;

import com.techvisio.accordia.outputadapter.dbo.UserDbo;
import com.techvisio.accordia.outputadapter.dbo.WorkItemDbo;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDbAdapter extends R2dbcRepository<UserDbo, Long> {
    // Add custom query methods if needed, e.g.:
    // Flux<WorkItemEntity> findByStatus(String status);
}
