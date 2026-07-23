package com.example.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        
        // Bootstrapping the context
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);

        // Asking the context to provide the MessageService implementation
        MessageService mailService = appCtx.getBean(MessageService.class);

        // Executing the method
        mailService.sendMessage();
    }

}