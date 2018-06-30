package com.ajn.design.pattern.abstractfactory;

import com.ajn.design.pattern.factory.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
