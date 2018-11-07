package com.udemy.springannotations;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today no luck for you, go fuck yourself!";
    }
}
