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
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int questionId;
    private int courseId;
    private String explanation;
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
   private List<Answer> answerList = new ArrayList<>();

}
