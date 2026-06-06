package com.qaschool.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// Această adnotare îi spune lui Java să ignore orice alte câmpuri din răspuns de care nu avem nevoie acum, ca să nu crape testul
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse {

    @JsonProperty("api_key")
    private String apiKey;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("token")
    private String token;

    private String email;
    private String name;

    public UserResponse() {}

    // Getters și Setters pentru a extrage datele în testul principal
    public String getApiKey() { return apiKey; }
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}