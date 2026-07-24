package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Defines a bean for dependency injection
    @Bean
    public MessageService emailServiceBean() {
        return new EmailService();
    }

}