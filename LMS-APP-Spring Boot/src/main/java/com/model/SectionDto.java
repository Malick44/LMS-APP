package com.model;

import com.dto.CourseDto;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link Section} entity
 */
@Data
@Builder
public class SectionDto implements Serializable {
    private final Integer id;
    private final String title;
    private final CourseDto course;
    @Singular
    private final List<ParagraphDto> paragraphs;
    @Singular
    private final List<QuizDto> quizzes;

    /**
     * A DTO for the {@link Paragraph} entity
     */
    @Data
    public static class ParagraphDto implements Serializable {
        private final Integer id;
        private final String paragraphContent;
        private final boolean completed;
    }

    /**
     * A DTO for the {@link Quiz} entity
     */
    @Data
    public static class QuizDto implements Serializable {
        private final Integer id;
        private final com.dto.SectionDto section;
    }
}