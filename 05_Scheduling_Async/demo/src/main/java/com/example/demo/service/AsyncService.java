package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void runAsyncTask(String taskName) {
        System.out.println("Started async task: " + taskName + " on thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000); // simulate long task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Finished async task: " + taskName);
    }
}
