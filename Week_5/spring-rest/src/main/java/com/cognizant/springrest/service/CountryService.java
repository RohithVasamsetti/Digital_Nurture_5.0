package com.cognizant.springrest.service;

import com.cognizant.springrest.model.Country;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountryService {

    private static Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Country("IN", "India"));
        countryMap.put("US", new Country("US", "United States"));
        countryMap.put("JP", new Country("JP", "Japan"));
        countryMap.put("AU", new Country("AU", "Australia"));
    }

    public Country getCountry(String code) {
        return countryMap.get(code.toUpperCase());
    }
}