package com.test.bu;

import config.SpringConfig;
import config.SpringConfig2;
import entity.Animal;
import entity.World;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ServiceTest;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Animal bean = context.getBean(Animal.class);
        System.out.println(bean.getName());
        /*context.register(SpringConfig2.class);
        World bean1 = context.getBean(World.class);
        System.out.println(bean1.getName());*/
        ServiceTest serviceTest = context.getBean(ServiceTest.class);
        System.out.println(serviceTest.getAnimalName());
    }
}
