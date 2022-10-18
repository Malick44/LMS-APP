package com.repository;

import com.model.Answer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findByQuestion_QuestionId(Integer questionId);

}