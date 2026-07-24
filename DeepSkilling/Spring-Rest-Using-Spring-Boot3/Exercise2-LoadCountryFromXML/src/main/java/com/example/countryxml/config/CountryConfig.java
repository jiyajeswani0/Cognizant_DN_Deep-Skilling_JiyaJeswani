package com.example.countryxml.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// Import the legacy XML configuration into our Spring Boot app
@Configuration
@ImportResource("classpath:country.xml")
public class CountryConfig {

}