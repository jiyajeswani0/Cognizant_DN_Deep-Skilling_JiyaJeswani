package com.example.findcountry;

import com.example.findcountry.entity.Country;
import com.example.findcountry.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise4FindCountryByCodeApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(Exercise4FindCountryByCodeApplication.class, args);
    }

    @Override
    public void run(String... args) {
        
        // Saving custom data
        countryService.saveCountry(new Country("NZ", "New Zealand"));
        countryService.saveCountry(new Country("BR", "Brazil"));
        countryService.saveCountry(new Country("IT", "Italy"));

        // Ask the database to find just ONE specific record
        Country myCountry = countryService.searchByCountryCode("NZ");

        System.out.println("\n===== Lookup Result =====");
        System.out.println(myCountry);
        System.out.println("=========================\n");
    }
}