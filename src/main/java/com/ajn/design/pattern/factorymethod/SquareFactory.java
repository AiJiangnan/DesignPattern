package com.ajn.design.pattern.factorymethod;

import com.ajn.design.pattern.factory.Shape;
import com.ajn.design.pattern.factory.Square;

/**
 * @author 艾江南
 * @date 2019/9/16
 */
public class SquareFactory extends ShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
