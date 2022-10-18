package com.dto;

import com.model.Answer;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Answer} entity
 */
@Data
public class AnswerDto implements Serializable {
    private final Integer id;
    private final boolean isCorrect;
    private final boolean isChecked;
    private final Integer questionQuestionId;
}