package com.repository;

import com.model.Quiz_Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Quiz_AnswerRepository extends JpaRepository<Quiz_Answer, Integer> {
}