package com.ajn.design.pattern.factorymethod;

/**
 * @author 艾江南
 * @date 2019/9/6
 */
public class Main {

    public static void main(String[] args) {
        new CircleFactory().operate();
        new RectangleFactory().operate();
        new SquareFactory().operate();
    }
}
