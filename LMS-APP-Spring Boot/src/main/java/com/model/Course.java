package com.model;

import lombok.*;

import javax.persistence.*;
import javax.print.attribute.standard.Media;
import java.time.Duration;
import java.util.List;
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Course {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private  Integer courseId;

    private String Category;
    private String title;

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

    @ManyToOne
    @JoinColumn(name = "contentId")
    private Content content;






}
