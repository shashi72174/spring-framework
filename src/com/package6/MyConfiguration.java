package com.package6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyConfiguration {

    public MyConfiguration() {
        System.out.println("myconfiguration contructor called");
    }
    @Bean
    public TestBean testBean() {
        return new TestBean(10);
    }
}
