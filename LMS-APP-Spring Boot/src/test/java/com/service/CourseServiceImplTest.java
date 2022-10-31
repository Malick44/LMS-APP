package com.service;

import com.model.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseServiceImplTest {
//@Autowired
    @Autowired
    private CourseService courseService;
    @Test
    void getCourse() {

        assertTrue(1== courseService.getCourse(1).getCourseId());


    }
}