package com.udemy.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeActivity7App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeActivity7Conf.class);

        Coach cfCoach = context.getBean("CFCoach", Coach.class);

        System.out.println(cfCoach.getDailyWorkout());
        System.out.println(cfCoach.getDailyFortune());
    }
}
