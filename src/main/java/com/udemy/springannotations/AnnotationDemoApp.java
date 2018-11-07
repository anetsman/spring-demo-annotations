package com.udemy.springannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan("com.udemy.springannotations")
public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read spring conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
