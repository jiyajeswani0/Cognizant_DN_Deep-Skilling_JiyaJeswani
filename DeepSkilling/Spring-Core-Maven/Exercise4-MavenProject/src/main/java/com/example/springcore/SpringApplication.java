package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

        // Setup ApplicationContext
        ApplicationContext springContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Fetch Student instance
        Student pupil = springContext.getBean(Student.class);

        // Invoke method
        pupil.showDetails();
    }

}