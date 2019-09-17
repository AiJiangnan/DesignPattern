package com.ajn.design.pattern.factorymethod;

import com.ajn.design.pattern.factory.Circle;
import com.ajn.design.pattern.factory.Shape;

/**
 * @author 艾江南
 * @date 2019/9/16
 */
public class CircleFactory extends ShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
