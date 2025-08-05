package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity                     // Marks as JPA entity
@Table(name = "customers") // Optional: specify table name
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates primary key
    private Long id;

    @Column(nullable = false) // Maps to DB column
    private String name;

    // One customer can have many orders
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    public Customer() {}

    public Customer(String name) {
        this.name = name;
    }

    // Getters and setters  ----> Alternatively we could have used Lombok
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
