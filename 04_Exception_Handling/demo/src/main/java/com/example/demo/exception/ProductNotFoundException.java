package com.example.demo.exception;

// Custom exception thrown when a product is not found
public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}
