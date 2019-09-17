package com.ajn.design.pattern.proxy;

/**
 * @author 艾江南
 * @date 2019/3/19
 */
public class ProxyDemo {

    public static void main(String[] args) {
        IHello iHello = FacadeProxy.newMapperProxy(IHello.class);
        iHello.sayHello("ajn");
    }

}
