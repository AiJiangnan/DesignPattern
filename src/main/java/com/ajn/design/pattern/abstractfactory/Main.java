package com.ajn.design.pattern.abstractfactory;

import com.ajn.design.pattern.factory.Shape;

public class Main {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape;
        shape = shapeFactory.getShape("CIRCLE");
        shape.draw();
        shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
        shape = shapeFactory.getShape("SQUARE");
        shape.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color;
        color = colorFactory.getColor("RED");
        color.fill();
        color = colorFactory.getColor("GREEN");
        color.fill();
        color = colorFactory.getColor("BLUE");
        color.fill();
    }
}
