package com.test.bu;

import entity.Animal;
import entity.World;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        World world1 = (World) context.getBean("world");
        world1.writeAnimal();
    }
}
