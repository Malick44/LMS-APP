package com.controller;

import com.model.Course;
import com.dto.CourseDto;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/{courseId}")
    public String getCourse(@PathVariable Integer courseId) {

        Course course = courseService.getCourse(courseId);

        return course.getDescription();
    }
    @PostMapping
    public ResponseEntity<Course> createCourse(CourseDto courseDto){


        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/test")
    public String test() {
        return "LMS in dev mode";
    }

}
