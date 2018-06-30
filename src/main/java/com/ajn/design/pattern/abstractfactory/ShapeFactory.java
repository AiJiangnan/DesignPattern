package com.ajn.design.pattern.abstractfactory;

import com.ajn.design.pattern.factory.Circle;
import com.ajn.design.pattern.factory.Rectangle;
import com.ajn.design.pattern.factory.Shape;
import com.ajn.design.pattern.factory.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
