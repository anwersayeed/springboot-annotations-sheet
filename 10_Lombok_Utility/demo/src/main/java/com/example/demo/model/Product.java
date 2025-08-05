package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter          // Generates getters
@ToString        // For readable output
@Builder         // Enables builder pattern
public class Product {
    private String name;
    private String category;
    private double price;
    private boolean inStock;
}
