package com.ajn.design.pattern.factorymethod;

import com.ajn.design.pattern.factory.Shape;

/**
 * @author 艾江南
 * @date 2019/9/6
 */
public abstract class ShapeFactory {

    public void operate() {
        Shape shape = factoryMethod();
        shape.draw();
    }

    protected abstract Shape factoryMethod();
}
