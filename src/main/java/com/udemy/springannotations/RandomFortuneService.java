package com.udemy.springannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @Value("${foo.fortunes}")
    private String[] fortunes;

    @Override
    public String getFortune() {
        return fortunes[new Random().nextInt(fortunes.length)];
    }
}
