package com.example.hellorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Simple GET endpoint
    @GetMapping("/hello")
    public String greetUser() {
        return "Hello World! This is my first REST endpoint.";
    }

}