package com.service;

import com.model.Course;
import com.dto.CourseDto;


public interface CourseService {

    Course createCourse(CourseDto courseDto);
    Course getCourse(Integer courseId);
}
