package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

        // Initialize the IoC container with our configuration
        ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);

        // Fetch the managed Library bean
        Library libraryInst = iocContainer.getBean(Library.class);

        // Verify it was instantiated correctly
        libraryInst.displayLibrary();
    }

}