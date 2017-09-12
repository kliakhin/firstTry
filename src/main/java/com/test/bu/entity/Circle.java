package com.test.bu.entity;

public class Circle implements Shape {

    private double radius;
    private Shape shape1;
    private Shape shape2;
    private ShapeType type;


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


    public double calcCommonSquare() {
        return Math.PI * radius * radius;
    }


    public void setType(ShapeType type) {
        this.type = type;
    }

    @Override
    public ShapeType getType() {
        return type;
    }
}
