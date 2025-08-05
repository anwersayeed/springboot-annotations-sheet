package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController = @Controller + @ResponseBody (returns data as JSON)
@RestController
public class ApiController {

    @Autowired
    private UserService userService;

    @GetMapping("/api/users")
    public List<String> getUsers() {
        return userService.fetchUsers(); // Returns JSON
    }
}
