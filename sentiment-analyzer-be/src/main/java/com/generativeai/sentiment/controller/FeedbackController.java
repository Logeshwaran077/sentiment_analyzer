package com.generativeai.sentiment.controller;

import com.generativeai.sentiment.entity.Feedback;
import com.generativeai.sentiment.repository.FeedbackReposiotry;
import com.generativeai.sentiment.service.SentimentAnalysisService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    private final FeedbackReposiotry feedbackReposiotry;
    private final SentimentAnalysisService service;

    public FeedbackController(FeedbackReposiotry feedbackReposiotry, SentimentAnalysisService service) {
        this.feedbackReposiotry = feedbackReposiotry;
        this.service = service;
    }

    @GetMapping
    public List<Feedback> getAllFeedback(){
       return feedbackReposiotry.findAll();
    }

    @PostMapping
    public Feedback saveFeedback(@RequestBody String content){
        Feedback feedback = service.analyzeFeedback(content);
        return feedbackReposiotry.save(feedback);
    }
}
