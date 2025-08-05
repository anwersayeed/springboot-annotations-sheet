package com.example.demo.service;

public class EmailService implements MessageService {

    private final String message;

    public EmailService(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println("EmailService: " + message);
    }
}
