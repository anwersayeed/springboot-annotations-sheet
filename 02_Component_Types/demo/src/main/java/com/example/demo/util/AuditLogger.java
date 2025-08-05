package com.example.demo.util;

import org.springframework.stereotype.Component;

// @Component is a generic stereotype for any Spring-managed class
@Component
public class AuditLogger {
    public void log(String message) {
        System.out.println("[Audit] " + message);
    }
}
