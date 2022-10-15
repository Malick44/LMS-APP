package com.repository;

import com.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Optional<List<Answer>> findByQuestionId(int questionId);
}