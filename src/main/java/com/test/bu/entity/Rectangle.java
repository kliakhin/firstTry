package com.test.bu.entity;

public class Rectangle implements Shape {

    private double lenght;
    private double weight;

    public Rectangle(double lenght, double weight) {
        this.lenght = lenght;
        this.weight = weight;
    }

    @Override
    public double calcSquare() {
        return lenght * weight;
    }

    @Override
    public void init() {
        System.out.println("I'm rectangle");

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
}
