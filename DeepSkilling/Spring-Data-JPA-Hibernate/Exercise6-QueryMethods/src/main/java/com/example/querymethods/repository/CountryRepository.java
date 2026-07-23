package com.example.querymethods.repository;

import com.example.querymethods.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {

    // MAGIC: Spring parses this name and turns it into: 
    // "SELECT * FROM country WHERE countryName = ?"
    Country findByCountryName(String countryName);

}