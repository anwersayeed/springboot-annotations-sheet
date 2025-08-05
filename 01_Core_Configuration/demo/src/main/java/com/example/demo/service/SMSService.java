package com.example.demo.service;

public class SMSService implements MessageService {

    private final String message;

    public SMSService(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println("SMSService: " + message);
    }
}
