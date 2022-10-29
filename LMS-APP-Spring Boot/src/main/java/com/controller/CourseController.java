package com.controller;

import com.model.Course;
import com.service.CourseService;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    public ResponseEntity<Course> getCourse(Integer courseId){


        ResponseEntity<Course>  course = courseService.getCourse(Integer courseId);

        return null;

    }

}
