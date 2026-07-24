package com.example.jwtdemo.controller;

import com.example.jwtdemo.model.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    // Expects a POST request with a JSON payload
    @PostMapping("/login")
    public String authenticateUser(@RequestBody LoginRequest loginRequest) {
        
        // Simple hardcoded check for demonstration purposes
        if ("superadmin".equals(loginRequest.getUsername())
                && "password123".equals(loginRequest.getPassword())) {
            
            return "Welcome! Login was successful.";
        }
        
        return "Error: Invalid credentials provided.";
    }
}