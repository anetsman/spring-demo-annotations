package com.udemy.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CFCoach implements Coach {

    @Autowired
    @Qualifier("nextFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "50 burpes and go clean";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
