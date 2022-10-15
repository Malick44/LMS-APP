package com.model;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private boolean isCorrect=false;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;





}