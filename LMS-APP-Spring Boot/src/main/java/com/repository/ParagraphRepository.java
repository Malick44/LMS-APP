package com.repository;

import com.model.Paragraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParagraphRepository extends JpaRepository<Paragraph, Integer> {
    List<Paragraph> findBySection_Id(Integer id);

    List<Paragraph> findBySection_Title(String title);

}