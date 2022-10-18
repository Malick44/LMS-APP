package com.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contentId;
    private Integer courseId;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "content")
    private List<Section>sectionList = new ArrayList<>();

}
