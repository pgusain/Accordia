package com.techvisio.accordia.port.output;

import com.techvisio.accordia.domain.WorkItem.WorkItemAggregate;
import com.techvisio.accordia.domain.WorkItem.WorkItemEntity;

public interface WorkItemRepository {
    public reactor.core.publisher.Mono<WorkItemEntity> findById(String id);
    public reactor.core.publisher.Mono<WorkItemAggregate> findAggById(String id);
    public reactor.core.publisher.Flux<WorkItemEntity> findAll();
    public reactor.core.publisher.Mono<WorkItemEntity> delete(String id);
    public reactor.core.publisher.Mono<WorkItemEntity> create(WorkItemEntity workItem);
    public reactor.core.publisher.Mono<WorkItemEntity> update(String id, WorkItemEntity workItem);         
}
