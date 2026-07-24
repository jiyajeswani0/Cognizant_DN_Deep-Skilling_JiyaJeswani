package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Bean declaration for GreetingService
    @Bean
    public GreetingService greetingService() {
        GreetingService myService = new GreetingService();
        return myService;
    }

}