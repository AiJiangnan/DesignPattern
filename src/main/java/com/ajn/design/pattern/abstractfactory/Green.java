package com.ajn.design.pattern.abstractfactory;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Green::fill()");
    }
}
