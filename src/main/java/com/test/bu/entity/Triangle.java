package com.test.bu.entity;

public class Triangle implements Shape {

    private double side1;
    private double side2;
    private double side3;
    private Shape shape;

    public Triangle(Shape shape) {
        this.shape = shape;
    }

    @Override
    public double calcSquare() {
        double s = (side1 + side2 + side3) / 2;
        return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))) - shape.calcSquare() / 2;
    }

    @Override
    public void init() {
        System.out.println("I'm triangle");
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
