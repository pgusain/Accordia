package com.techvisio.accordia.inputadapter;

import com.techvisio.accordia.inputadapter.model.WorkItemModel;
import com.techvisio.accordia.port.input.WorkItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WorkItemRestInputAdapter {

    @Autowired
    private final WorkItemService workItemService;

    public WorkItemRestInputAdapter(WorkItemService workItemService) {
        this.workItemService = workItemService;
    }

    @GetMapping("/work-items")
    public Flux<WorkItemModel> findAll() {
        return null;
    }

    @GetMapping("/work-items/{id}")
    public Mono<ResponseEntity<WorkItemModel>> getById(
            @org.springframework.web.bind.annotation.PathVariable("id") String id) {
        return null;
    }

    @PostMapping("/work-items")
    public Mono<ResponseEntity<WorkItemModel>> createWorkItem(
            @RequestBody Mono<WorkItemModel> workItemModelMono) {
        return workItemModelMono.flatMap(workItemModel ->
                workItemService.createWorkItem(workItemModel)
                        .map(ResponseEntity::ok)
        );
    }

    @PutMapping("/work-items/{id}")
    public Mono<ResponseEntity<WorkItemModel>> update(
            @PathVariable("id") String id,
            @RequestBody Mono<WorkItemModel> body) {
        return null;
    }

    @DeleteMapping("/work-items/{id}")
    public Mono<ResponseEntity<Void>> delete(
            @PathVariable("id") String id) {
        return null;
    }
}
