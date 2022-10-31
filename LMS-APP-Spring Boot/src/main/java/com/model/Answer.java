package com.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "answer")
@Component
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    private boolean isCorrect=false;
    private boolean isChecked= false;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;





}