package com.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.model.Section} entity
 */
@Data
public class SectionDto implements Serializable {
    private final Integer id;
    private final String title;
}