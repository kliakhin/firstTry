package com.test.bu.entity;

public class Rectangle implements Shape {

    private double lenght;
    private double weight;
    private ShapeType type;

    public Rectangle(double lenght, double weight) {
        this.lenght = lenght;
        this.weight = weight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }

    @Override
    public ShapeType getType() {
        return type;
    }
}
