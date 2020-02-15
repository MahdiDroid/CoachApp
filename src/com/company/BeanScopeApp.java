package com.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String[] args) {
        //load configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");

        ICoach theCoach = context.getBean("myCoach",ICoach.class);
        ICoach alphaCoach = context.getBean("myCoach",ICoach.class);

        boolean result = (theCoach == alphaCoach);
        System.out.println("\n Pointing to the same object:   "+result);
        System.out.println("Memory the coach " + theCoach );
        System.out.println("Memory alpha  coach " +alphaCoach );

    context.close();

    }
}
