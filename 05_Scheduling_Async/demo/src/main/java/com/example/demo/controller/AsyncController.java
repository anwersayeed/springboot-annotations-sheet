package com.example.demo.controller;

import com.example.demo.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/run")
    public String runAsyncJob() {
        asyncService.runAsyncTask("Manual-Job");
        return "Async job triggered successfully!";
    }
}
