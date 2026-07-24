package com.example.countryxml;

import com.example.countryxml.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Exercise2LoadCountryFromXmlApplication {

    public static void main(String[] args) {
        
        // Run application and get the context
        ApplicationContext appCtx = SpringApplication.run(Exercise2LoadCountryFromXmlApplication.class, args);
        
        // Retrieve bean defined in our XML file
        Country myCountry = appCtx.getBean("country", Country.class);
        
        System.out.println("\n====== XML Bean Loaded ======");
        System.out.println(myCountry);
        System.out.println("=============================\n");
    }
}