package com.ajn.design.pattern.abstractfactory;

import com.ajn.design.pattern.factory.Circle;
import com.ajn.design.pattern.factory.Rectangle;
import com.ajn.design.pattern.factory.Shape;
import com.ajn.design.pattern.factory.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if ("CIRCLE".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
