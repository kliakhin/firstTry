package com.test.bu.entity;

public class Circle implements Shape {

    private double radius;
    private Shape shape1;
    private Shape shape2;

    public Circle(Shape shape1, Shape shape2) {
        this.shape1 = shape1;
        this.shape2 = shape2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return calcCommonSquare() - shape1.calcSquare() - shape2.calcSquare();
    }

    @Override
    public void init() {
        System.out.println("I'm circle");
    }

    public double calcCommonSquare() {
        return Math.PI * radius * radius;
    }
}
