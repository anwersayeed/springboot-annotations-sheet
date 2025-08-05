package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

// @Repository is a specialization of @Component, used for persistence layer
@Repository
public class UserRepository {
    public List<String> getAllUsers() {
        return Arrays.asList("Alice", "Bob", "Charlie");
    }
}
