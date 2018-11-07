package com.udemy.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.udemy.springannotations")
@PropertySource("sport.properties")
public class SportConfig {

    //define bean for sadFortuneService
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //define bean for swimCoach and inject the dependencies
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
