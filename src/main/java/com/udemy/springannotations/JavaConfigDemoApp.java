package com.udemy.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring conf file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from the container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        BoxingCoach boxingCoach = context.getBean("boxingCoach", BoxingCoach.class);

        //call a method on the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        System.out.println(boxingCoach.getEmail());
        System.out.println(boxingCoach.getTeam());

        context.close();
    }
}
