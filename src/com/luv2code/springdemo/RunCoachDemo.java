package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunCoachDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach c1 = context.getBean("myRunCoach", Coach.class);
        Coach c2 = context.getBean("myRunCoach", Coach.class);

        System.out.println(c1 == c2);
        System.out.println(c1);
        System.out.println(c2);

        context.close();
    }
}
