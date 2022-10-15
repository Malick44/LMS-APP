package com.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contentId;
    private int courseId;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "content")
    private List<Section>sectionList = new ArrayList<>();

}
