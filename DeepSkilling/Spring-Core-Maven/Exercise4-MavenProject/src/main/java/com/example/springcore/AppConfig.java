package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Registering Student bean in the IoC container
    @Bean
    public Student studentBean() {
        Student newStudent = new Student();
        return newStudent;
    }

}