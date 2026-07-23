package com.example.querymethods;

import com.example.querymethods.entity.Country;
import com.example.querymethods.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise6QueryMethodsApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(Exercise6QueryMethodsApplication.class, args);
    }

    @Override
    public void run(String... args) {

        countryService.saveCountry(new Country("FR", "France"));
        countryService.saveCountry(new Country("ESP", "Spain"));
        countryService.saveCountry(new Country("MEX", "Mexico"));

        // Searching by the actual name, NOT the primary key!
        Country myCountry = countryService.searchByFullName("Mexico");

        System.out.println("\n===== Magic Query Search Result =====");
        System.out.println(myCountry);
        System.out.println("=====================================\n");
    }
}