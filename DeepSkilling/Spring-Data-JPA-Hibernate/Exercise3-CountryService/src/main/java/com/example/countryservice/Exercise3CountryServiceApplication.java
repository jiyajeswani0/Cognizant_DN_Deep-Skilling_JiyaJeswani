package com.example.countryservice;

import com.example.countryservice.entity.Country;
import com.example.countryservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise3CountryServiceApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(Exercise3CountryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Saving completely new custom data to our database!
        countryService.saveCountry(new Country("CAN", "Canada"));
        countryService.saveCountry(new Country("AUS", "Australia"));
        countryService.saveCountry(new Country("GER", "Germany"));

        System.out.println("\n===== Fetching All Countries from Database =====");
        for (Country country : countryService.getAllCountries()) {
            System.out.println(country);
        }
        System.out.println("================================================\n");
    }
}