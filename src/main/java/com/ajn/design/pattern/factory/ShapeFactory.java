package com.ajn.design.pattern.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }
        if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new Square();
        }
        return null;
    }
}
