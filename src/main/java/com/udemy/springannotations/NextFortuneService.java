package com.udemy.springannotations;

public class NextFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You'll not pass";
    }
}
