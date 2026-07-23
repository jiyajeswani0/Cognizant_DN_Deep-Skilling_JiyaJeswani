package com.example.findcountry.service;

import com.example.findcountry.entity.Country;
import com.example.findcountry.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public void saveCountry(Country country) {
        countryRepository.save(country);
    }

    // Our new database lookup method
    public Country searchByCountryCode(String countryCode) {
        
        // Find by Primary Key
        Optional<Country> foundCountry = countryRepository.findById(countryCode);
        
        // Return the country if found, otherwise return a null value
        return foundCountry.orElse(null);
    }
}