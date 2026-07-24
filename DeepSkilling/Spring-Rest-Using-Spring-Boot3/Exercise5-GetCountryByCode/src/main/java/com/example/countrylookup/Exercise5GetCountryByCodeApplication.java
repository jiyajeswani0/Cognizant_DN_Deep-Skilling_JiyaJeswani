package com.example.countrylookup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise5GetCountryByCodeApplication {

    public static void main(String[] args) {
        System.out.println("Starting Country Lookup API...");
        SpringApplication.run(Exercise5GetCountryByCodeApplication.class, args);
    }
}