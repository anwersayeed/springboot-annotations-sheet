package com.example.demo.controller;

import com.example.demo.exception.ProductNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private List<String> products = Arrays.asList("Book", "Laptop", "Pen");

    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {
        // Trigger local exception handler
        if (id == -999) {
            throw new IllegalArgumentException("Negative ID is not allowed");
        }

        // Trigger global exception handler
        if (id < 0 || id >= products.size()) {
            throw new ProductNotFoundException("Product with ID " + id + " not found");
        }

        return products.get(id);
    }

    // Local exception handler for IllegalArgumentException
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body("Invalid argument: " + ex.getMessage());
    }
}
