package com.service;

import com.model.Course;
import com.dto.CourseDto;
import com.model.Section;
import com.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public Course createCourse(CourseDto courseDto) {

        return new Course();
    }

    @Override
    public Course getCourse(Integer courseId) {

        Optional<Course> couOpt = courseRepository.findByCourseId(courseId);

        Course course = couOpt.get();



        // List<Section> sections = sectionRepository.findByCourse_CourseId(1);

        System.out.println("Id: " + course.getCourseId() + "Author: " + course.getAuthor().getName());

        return course;
    }
}
