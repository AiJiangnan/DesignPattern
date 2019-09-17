package com.ajn.design.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @author 艾江南
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        try {
            Singleton instance = null;
            Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                instance = (Singleton) constructor.newInstance();
                break;
            }
            System.out.println(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
