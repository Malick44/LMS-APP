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
    private Integer assessmentId;
    private Integer userId;
    private Integer courseId;
  //  private List<Question> assessmentQuestionList;
    private Integer grade;
    private boolean isClear;
}
