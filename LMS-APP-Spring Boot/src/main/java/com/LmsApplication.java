package com;

import com.dto.CourseDto;
import com.model.Course;
import com.model.Section;
import com.repository.CourseRepository;
import com.repository.SectionRepository;
import com.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);



	}

}
