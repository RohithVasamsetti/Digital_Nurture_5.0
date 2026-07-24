package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryService {

    public static Country getCountry() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        return context.getBean("country", Country.class);
    }
}