package com.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.model.Assessment} entity
 */
@Data
public class AssessmentDto implements Serializable {
    private final Integer assessmentId;
    private final Integer userId;
    private final Integer courseId;
    private final Integer grade;
    private final boolean isClear;
}