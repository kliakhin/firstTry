package com.test.bu;

import org.joda.time.DateTime;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World1!");

        LocalDateTime now = LocalDateTime.now();

        System.out.println("now " + now);

        DateTime dateTime = new DateTime();

        System.out.println("Joda " + dateTime.getDayOfYear());
    }
}
