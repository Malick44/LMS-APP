package com.model;

import javax.print.attribute.standard.Media;
import java.time.Duration;
import java.util.List;

public class Course {
    private  int Id;
    private String Category;
    private String title;
    private String author;
    private String subject;
    private String description;
    private String type;
    private String rating;
    private String level;
    private Duration duration;
    private String keywords;
    private String language= "en-US";
    private int Year;
    private int view;
    private String price;
    private Content content;
    private List<Flashcard> flashcard;
    private List<Quiz> quiz;
    private Assessment assessment;




}
