package com.test.bu;

import entity.Animal;
import org.joda.time.DateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.writeName();

        System.out.println("And now from context: ");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal = (Animal) context.getBean("animal");
        animal.writeName();

    }
}
