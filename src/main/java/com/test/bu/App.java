package com.test.bu;

import com.test.bu.entity.Circle;
import com.test.bu.entity.Shape;
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

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(circle);

        double sumOfSquares = shapes.stream().mapToDouble(Shape::calcSquare).sum();

        shapes.forEach(shape -> System.out.println(shape.calcSquare()));

        List<Shape> filteredShapes = shapes.stream().filter(shape -> 25.0 != shape.calcSquare()).collect(Collectors.toList());

        System.out.println("size = " + filteredShapes.size());

        List<Double> collect = filteredShapes.stream().map(shape -> shape.calcSquare() + 5).collect(Collectors.toList());
        for (Double aDouble : collect) {
            System.out.println(aDouble);

        }


        System.out.println(sumOfSquares == ((Circle) circle).calcCommonSquare());


    }
}
