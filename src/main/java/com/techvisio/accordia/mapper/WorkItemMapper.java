package com.techvisio.accordia.mapper;

import com.techvisio.accordia.domain.WorkItem.WorkItemEntity;
import com.techvisio.accordia.inputadapter.model.WorkItemModel;
import com.techvisio.accordia.outputadapter.dbo.WorkItemDbo;

public final class WorkItemMapper {
  private WorkItemMapper() {}

  public static WorkItemEntity toEntity(WorkItemDbo d) {
    return WorkItemEntity.builder()
        .id(d.getId())
        .customerId(d.getCustomerId())
        .jobTitle(d.getJobTitle())
        .description(d.getDescription())
        .status(d.getStatus())
        .build();
  }

    public static WorkItemEntity toEntity(WorkItemModel e) {
    return WorkItemEntity.builder()
        .id(e.getId())
        .customerId(e.getCustomerId())
        .jobTitle(e.getJobTitle())
        .description(e.getDescription())
        .status(e.getStatus())
        .build();
  }

    public static WorkItemModel toModel(WorkItemEntity e) {
    return WorkItemModel.builder()
        .id(e.getId())
        .customerId(e.getCustomerId())
        .jobTitle(e.getJobTitle())
        .description(e.getDescription())
        .status(e.getStatus())
        .build();
  }

  public static WorkItemDbo toDbo(WorkItemEntity e) {
    return WorkItemDbo.builder()
            .id(e.getId())
            .customerId(e.getCustomerId())
            .jobTitle(e.getJobTitle())
            .description(e.getDescription())
            .status(e.getStatus())
            .build();
  }
}

