package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main (String[] args){

        //load configuration file
        ClassPathXmlApplicationContext  context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean
        ICoach thecoach = context.getBean("myCoach", ICoach.class);
        ICoach thecoach1 = context.getBean("trackCoach", ICoach.class);


        // call method

        System.out.println(thecoach.getDailyWorkout());
        System.out.println(thecoach.getDailyFortune());
        System.out.println(thecoach1.getDailyFortune());
        // close the context

        context.close();




    }
}
