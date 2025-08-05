package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"internalCode"}) // This field will be ignored in response
public class User {

    private String username;

    @JsonProperty("email_address") // Maps this field to/from JSON key 'email_address'
    private String email;

    private String role;

    private String internalCode; // This will be ignored in JSON response

    public User() {}

    public User(String username, String email, String role, String internalCode) {
        this.username = username;
        this.email = email;
        this.role = role;
        this.internalCode = internalCode;
    }

    // Getters and setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getInternalCode() { return internalCode; }
    public void setInternalCode(String internalCode) { this.internalCode = internalCode; }
}
