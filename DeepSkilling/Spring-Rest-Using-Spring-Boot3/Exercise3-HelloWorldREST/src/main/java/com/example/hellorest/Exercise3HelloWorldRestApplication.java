package com.example.hellorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise3HelloWorldRestApplication {

    public static void main(String[] args) {
        System.out.println("Starting Hello World REST API...");
        SpringApplication.run(Exercise3HelloWorldRestApplication.class, args);
    }

}