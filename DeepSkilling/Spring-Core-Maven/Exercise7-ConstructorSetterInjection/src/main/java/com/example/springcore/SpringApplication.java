package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

        // Bootstrap the application context
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // Fetch the Employee bean which has been fully injected
        Employee emp = ctx.getBean(Employee.class);

        // Display the output
        emp.displayDetails();

    }

}