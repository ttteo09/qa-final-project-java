package com.qaschool.api.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRequest {
    private String email;
    private String password;
    private String name;

    // Constructor gol cerut obligatoriu de librăria Jackson pentru deserializare
    public UserRequest() {}

    // Constructor pentru Register și Login
    public UserRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Constructor pentru Update Profile (unde avem nevoie și de nume)
    public UserRequest(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    // Getters și Setters - uneltele prin care REST Assured citește și scrie datele
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}