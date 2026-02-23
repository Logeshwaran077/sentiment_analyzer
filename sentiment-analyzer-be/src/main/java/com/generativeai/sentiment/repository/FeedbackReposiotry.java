package com.generativeai.sentiment.repository;

import com.generativeai.sentiment.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackReposiotry extends JpaRepository<Feedback, Long> {
}
