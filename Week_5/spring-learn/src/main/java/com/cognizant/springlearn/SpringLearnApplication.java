package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.springlearn.service.CountryService;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Application Started");

        SpringApplication.run(SpringLearnApplication.class, args);

        displayDate();

        System.out.println(CountryService.getCountry());

        LOGGER.info("Application Finished");
    }

    public static void displayDate() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat sdf =
                context.getBean("dateFormat", SimpleDateFormat.class);

        System.out.println("Today's Date : " +
                sdf.format(new Date()));
    }
}