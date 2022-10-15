package com.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int assessmentId;


    private int userId;
    private int courseId;
  //  private List<Question> assessmentQuestionList;
    private int score;
    private boolean isClear;
}
