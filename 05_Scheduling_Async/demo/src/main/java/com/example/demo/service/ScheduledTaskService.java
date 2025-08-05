package com.example.demo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

    // Runs every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void printTimeTask() {
        System.out.println("Scheduled task running at: " + java.time.LocalTime.now());
    }
}
