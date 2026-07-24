package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Tell the IoC container to manage the Library bean
    @Bean
    public Library libraryBean() {
        Library myLibrary = new Library();
        return myLibrary;
    }

}