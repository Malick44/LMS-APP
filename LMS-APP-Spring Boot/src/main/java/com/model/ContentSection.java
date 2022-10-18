package com.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ContentSection {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contentSectionId;
    private Integer contentId;
    private String title;
}
