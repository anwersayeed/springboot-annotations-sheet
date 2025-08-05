package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String item;

    @ManyToOne                     // Many orders can belong to one customer
    @JoinColumn(name = "customer_id") // Foreign key
    private Customer customer;

    public Order() {}

    public Order(String item, Customer customer) {
        this.item = item;
        this.customer = customer;
    }

    // Getters and setters
    // ...
}
