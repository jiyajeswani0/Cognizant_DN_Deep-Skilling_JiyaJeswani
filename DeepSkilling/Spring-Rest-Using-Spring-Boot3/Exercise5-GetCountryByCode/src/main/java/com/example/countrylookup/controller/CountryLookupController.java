package com.example.countrylookup.controller;

import com.example.countrylookup.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryLookupController {

    // Dynamic endpoint using @PathVariable to extract the code from the URL
    @GetMapping("/country/{countryCode}")
    public Country searchCountry(@PathVariable("countryCode") String countryCode) {

        switch (countryCode.toUpperCase()) {
            case "IN": return new Country("IN", "India");
            case "US": return new Country("US", "United States of America");
            case "UK": return new Country("UK", "United Kingdom");
            case "JP": return new Country("JP", "Japan");
            default:   return new Country("ERR", "Country Not Found");
        }
    }
}