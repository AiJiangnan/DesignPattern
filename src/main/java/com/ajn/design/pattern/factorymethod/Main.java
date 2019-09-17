package com.ajn.design.pattern.factorymethod;

/**
 * @author 艾江南
 * @date 2019/9/6
 */
public class Main {

    public static void main(String[] args) {
        ShapeFactory factory;
        factory = new CircleFactory();
        factory.operate();
        factory = new RectangleFactory();
        factory.operate();
        factory = new SquareFactory();
        factory.operate();
    }
}
