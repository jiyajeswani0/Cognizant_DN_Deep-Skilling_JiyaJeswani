package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Department itDepartment() {
        // Constructor Injection
        return new Department("Software Engineering");
    }

    @Bean
    public Employee softwareEngineer() {
        // Constructor injection of department
        Employee emp = new Employee(itDepartment());
        
        // Setter injection of name
        emp.setEmployeeName("Gopal Varshney");
        
        return emp;
    }

}