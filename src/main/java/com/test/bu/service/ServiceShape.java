package com.test.bu.service;

import com.test.bu.entity.Rectangle;
import com.test.bu.entity.Shape;
import com.test.bu.entity.ShapeType;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceShape {

    public double calcSquare(Shape shape) {
        if (shape.getType().equals(ShapeType.RECTANGLE)) {
            Rectangle shape1 = (Rectangle) shape;
            double lenght = shape1.getLenght();
            double weight = shape1.getWeight();
            return lenght * weight;
        } else if (shape.getType().equals(ShapeType.TRIANGLE)) {
            return 10;
        } else if (shape.getType().equals(ShapeType.CIRCLE)) {
            return 15;
        }
        return 0;
    }

}
