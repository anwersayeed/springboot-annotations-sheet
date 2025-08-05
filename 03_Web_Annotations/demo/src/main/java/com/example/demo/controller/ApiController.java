package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin // Enables CORS globally for this controller
public class ApiController {

    @GetMapping("/hello")
    public String hello(@RequestHeader("User-Agent") String userAgent) {
        return "Hello! Your browser is: " + userAgent;
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        return "User created: " + user.getName() + ", Age: " + user.getAge();
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User user) {
        return "User with ID " + id + " updated to name: " + user.getName();
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        return "User with ID " + id + " deleted.";
    }

    @PatchMapping("/user/{id}")
    public String patchUser(@PathVariable int id, @RequestBody Map<String, Object> updates) {
        return "User " + id + " partially updated with fields: " + updates.keySet();
    }

    @GetMapping("/cookie")
    public String readCookie(@CookieValue(value = "session", defaultValue = "none") String sessionId) {
        return "Cookie session ID = " + sessionId;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Guest") String name) {
        return "Hello, " + name;
    }
}
