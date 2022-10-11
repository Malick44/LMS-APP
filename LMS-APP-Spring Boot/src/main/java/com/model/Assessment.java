package com.model;

import java.util.List;

public class Assessment {
    private int id;
    private int userId;
    private int courseId;
    private List<Question> assessmentQuestionList;
    private int score;
    private boolean isClear;
}
