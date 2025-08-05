package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final List<User> userList = new ArrayList<>(
            List.of(
                    new User("alice", "alice@example.com", "ADMIN", "IC123"),
                    new User("bob", "bob@example.com", "USER", "IC456")
            )
    );

    @GetMapping
    public List<User> getUsers() {
        return userList;
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        userList.add(user);
        return "User created: " + user.getUsername() + " | Email: " + user.getEmail();
    }
}

