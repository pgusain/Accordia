package com.techvisio.accordia.port.input;

import com.techvisio.accordia.inputadapter.model.WorkItemModel;

import com.techvisio.accordia.mapper.WorkItemMapper;
import com.techvisio.accordia.port.output.WorkItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WorkItemServiceImpl implements WorkItemService {
    @Autowired
    WorkItemRepository workItemRepository;

    @Override
    public Mono<WorkItemModel> createWorkItem(WorkItemModel workItemModel) {
        return workItemRepository.create(WorkItemMapper.toEntity(workItemModel))
                .map(WorkItemMapper::toModel);
    }

    @Override
    public Mono<WorkItemModel> deleteWorkItem(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<WorkItemModel> findWorkItemWithCriteria(WorkItemModel filter) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<WorkItemModel> getWorkItemById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<WorkItemModel> updateWorkItem(String id, WorkItemModel job) {
        // TODO Auto-generated method stub
        return null;
    }

}
