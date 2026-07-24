package com.example.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise1CreateSpringWebProjectdemoApplication {

    public static void main(String[] args) {
        // Initializes the Spring Boot REST Application
        SpringApplication.run(Exercise1CreateSpringWebProjectdemoApplication.class, args);
        System.out.println("REST API Application has successfully started!");
    }

}