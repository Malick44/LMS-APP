package com.dto;

import com.model.Author;
import com.model.Course;
import com.model.Section;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.io.Serializable;
import java.time.Duration;
import java.util.List;

/**
 * A DTO for the {@link Course} entity
 */
@Data
@Builder
public class CourseDto implements Serializable {
    private final Integer courseId;
    private final Author author;
    private final String subject;
    private final String description;
    private final String type;
    private final String rating;
    private final String level;
    private final Duration duration;
    private final String keywords;
    private final String language;
    private final Integer Year;
    private final Integer view;
    private final String price;
    private final String Category;
    private final String title;
    @Singular
    private List<Section> sections;
}