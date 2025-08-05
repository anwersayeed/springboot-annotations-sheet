package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// @Controller is used for returning views (like Thymeleaf or JSP)
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String showUsers(Model model) {
        List<String> users = userService.fetchUsers();
        model.addAttribute("users", users);
        return "users"; // Will render users.html from /templates
    }
}
