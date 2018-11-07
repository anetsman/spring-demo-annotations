package com.udemy.springannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HappyFortuneService implements FortuneService {

    @Value("${foo.fortunes}")
    private String[] fortunes;

    @Override
    public String getFortune() {
        return "Than's your fortune for today";
    }

    @PostConstruct
    public void startUp() {
        for (int i=0; i <= fortunes.length - 1; i++) {
            System.out.println(fortunes[i]);
        }
    }
}
