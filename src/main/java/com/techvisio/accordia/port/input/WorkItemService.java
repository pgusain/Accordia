package com.techvisio.accordia.port.input;

import com.techvisio.accordia.inputadapter.model.WorkItemModel;

public interface WorkItemService {

    public reactor.core.publisher.Mono<WorkItemModel> getWorkItemById(String id);
    public reactor.core.publisher.Flux<WorkItemModel> findWorkItemWithCriteria(WorkItemModel filter);
    public reactor.core.publisher.Mono<WorkItemModel> deleteWorkItem(String id);
    public reactor.core.publisher.Mono<WorkItemModel> createWorkItem(WorkItemModel workItemModel);
    public reactor.core.publisher.Mono<WorkItemModel> updateWorkItem(String id, WorkItemModel workItemModel);
}
