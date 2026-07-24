package com.example.jwtdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise6JwtAuthenticationApplication {

    public static void main(String[] args) {
        System.out.println("Starting Auth API Server...");
        SpringApplication.run(Exercise6JwtAuthenticationApplication.class, args);
    }
}