package com.udemy.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring conf file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from the container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
//        BoxingCoach boxingCoach = context.getBean("boxingCoach", BoxingCoach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());

//        System.out.println(boxingCoach.getEmail());
//        System.out.println(boxingCoach.getTeam());

        context.close();
    }
}
