package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import com.example.demo.util.AuditLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service marks this class as a service/business logic layer component
@Service
public class UserService {

    @Autowired // Injecting the repository
    private UserRepository userRepository;

    @Autowired // Injecting a reusable component
    private AuditLogger auditLogger;

    public List<String> fetchUsers() {
        auditLogger.log("Fetching users from repository");
        return userRepository.getAllUsers();
    }
}
