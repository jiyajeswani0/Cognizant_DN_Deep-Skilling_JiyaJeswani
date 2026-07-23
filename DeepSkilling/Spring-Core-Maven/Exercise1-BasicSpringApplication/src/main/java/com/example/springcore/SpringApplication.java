package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        
        // Load the Spring context using the AppConfig class
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Fetch the GreetingService bean from the container
        GreetingService greetingBean = applicationContext.getBean(GreetingService.class);

        // Call the method to display the message
        greetingBean.displayMessage();
    }

}