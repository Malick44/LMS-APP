package com.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quiz_Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int quizAnswerId;
    private int quizId;
    private String answer;
    private boolean isCorrect;
}
