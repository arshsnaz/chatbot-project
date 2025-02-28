package com.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupportAgentChatbotApplication {
    public static void main(String[] args) {
        SpringApplication.run(SupportAgentChatbotApplication.class, args);
        System.out.println("Chatbot Backend is Running...");
    }
}
