package com.example.demo.controller;

import com.example.demo.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfer")
public class TransactionController {

    @Autowired
    private BankingService service;

    @PostMapping
    public String transfer(@RequestParam Long from,
                           @RequestParam Long to,
                           @RequestParam double amount) {
        service.transfer(from, to, amount);
        return "Transferred ₹" + amount + " from account " + from + " to " + to;
    }
}
