package com.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "content_id")
    private Content content;
    private String title;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "section")
    private List<Paragraph> paragraphList = new ArrayList<>();
    // private List<MediaFile> mediaUrlList;



}