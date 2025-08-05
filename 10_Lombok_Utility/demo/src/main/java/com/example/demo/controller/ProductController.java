package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product")
    public Product getProduct() {
        // Using Lombok builder to construct the object
        return Product.builder()
                .name("Tea")
                .category("Beverages")
                .price(99.99)
                .inStock(true)
                .build();
    }
}
