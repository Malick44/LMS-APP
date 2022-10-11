package com.model;

import java.util.List;

public class Quiz {
    private int Id;
    private int courseId;
    private int sectionId;
    private String title;
    private String question;
    private List<Quiz_Answer> answerList;
    private String explanation;
}
