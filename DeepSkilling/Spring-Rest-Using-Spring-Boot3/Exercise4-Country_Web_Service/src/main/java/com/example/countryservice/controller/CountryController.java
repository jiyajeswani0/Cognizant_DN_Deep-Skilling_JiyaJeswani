package com.example.countryservice.controller;

import com.example.countryservice.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    // Endpoint that automatically serializes the Country object to JSON
    @GetMapping("/country")
    public Country fetchCountryDetails() {
        // Returning a completely different country for your custom touch!
        return new Country("FR", "France");
    }

}