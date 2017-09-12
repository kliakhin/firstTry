package com.test.bu;

import com.test.bu.entity.Circle;
import com.test.bu.entity.Shape;
import com.test.bu.service.ServiceShape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape rectangle = (Shape) context.getBean("rectangle");
        Shape triangle = (Shape) context.getBean("triangle");
        Shape circle = (Shape) context.getBean("circle");


        ServiceShape service1 = (ServiceShape) context.getBean("service1");
        System.out.println("Rectangle square = " + service1.calcSquare(rectangle));
    }
}
