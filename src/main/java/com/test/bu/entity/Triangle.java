package com.test.bu.entity;

public class Triangle implements Shape {

    private double side1;
    private double side2;
    private double side3;
    private Shape shape;
    private ShapeType type;

    public Triangle(Shape shape) {
        this.shape = shape;
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

    public void setType(ShapeType type) {
        this.type = type;
    }

    @Override
    public ShapeType getType() {
        return type;
    }
}
