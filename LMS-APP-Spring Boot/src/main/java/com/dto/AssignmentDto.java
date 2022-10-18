package com.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.model.Assignment} entity
 */
@Data
public class AssignmentDto implements Serializable {
    private final Integer id;
    private final Integer userId;
    private final boolean isCompleted;
}