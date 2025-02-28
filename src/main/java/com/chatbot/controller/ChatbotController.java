package com.chatbot.controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.chatbot.model.Documentation;
import com.chatbot.repository.DocumentationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ChatbotController {

    private final DocumentationRepository documentationRepository;

    public ChatbotController(DocumentationRepository documentationRepository) {
        this.documentationRepository = documentationRepository;
    }

    @GetMapping("/ask")
    public String getAnswer(@RequestParam String question) {
        List<Documentation> results = documentationRepository.findByContentContainingIgnoreCase(question);

        if (!results.isEmpty()) {
            return "Best Answer: " + results.get(0).getContent();
        }
        return "No relevant answer found. Try different keywords.";
    }
}
