package com.model;

import lombok.*;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER, mappedBy = "section")
    @Singular private List<Paragraph> paragraphs;
    @Singular
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "section")
    private List<Quiz> quizzes;

    //private Resource resource;
    //private List<MediaFile> mediaUrlList;

}