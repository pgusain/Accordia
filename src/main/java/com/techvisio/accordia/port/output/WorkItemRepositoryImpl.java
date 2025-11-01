package com.techvisio.accordia.port.output;

import com.techvisio.accordia.domain.WorkItem.WorkItemAggregate;
import com.techvisio.accordia.domain.WorkItem.WorkItemEntity;

import com.techvisio.accordia.mapper.WorkItemMapper;
import com.techvisio.accordia.outputadapter.WorkItemDbAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class WorkItemRepositoryImpl implements WorkItemRepository {

    @Autowired
    WorkItemDbAdapter workItemDbAdapter;

    @Override
    public Mono<WorkItemEntity> create(WorkItemEntity workItemEntity) {
       return workItemDbAdapter.save(WorkItemMapper.toDbo(workItemEntity))
               .map(WorkItemMapper::toEntity);

    }

    @Override
    public Mono<WorkItemEntity> delete(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<WorkItemAggregate> findAggById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Flux<WorkItemEntity> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<WorkItemEntity> findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mono<WorkItemEntity> update(String id, WorkItemEntity workItem) {
        // TODO Auto-generated method stub
        return null;
    }

}
