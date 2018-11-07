package com.udemy.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeActivity7Conf {

    @Bean
    public FortuneService nextFortuneService() {
        return new NextFortuneService();
    }

    @Bean
    public Coach CFCoach() {
        return new CFCoach();
    }
}
