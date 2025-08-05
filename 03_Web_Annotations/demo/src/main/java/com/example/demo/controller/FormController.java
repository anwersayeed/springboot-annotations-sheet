package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("user") // Stores user object in session
public class FormController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form"; // loads form.html
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("message", "User submitted: " + user.getName());
        return "form";
    }

    @GetMapping("/clear")
    public String clearSession(SessionStatus status) {
        status.setComplete(); // clears session attributes
        return "redirect:/form";
    }
}
