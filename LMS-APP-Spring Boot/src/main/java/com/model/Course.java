package com.model;

import lombok.*;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@Setter
@NoArgsConstructor
@Table
@Entity
public class Course {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private  Integer courseId;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    private String subject;
    private String description;
    private String type;
    private String rating;
    private String level;
    private Duration duration;
    private String keywords;
    private String language= "en-US";
    private Integer Year;
    private Integer view;
    private String price;
    private static Long views;
    private String Category;
    private String title;
    @Singular
    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY, mappedBy = "course")
    private List<Section> sections;




}
