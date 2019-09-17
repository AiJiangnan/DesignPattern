package com.ajn.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 艾江南
 * @date 2019/3/19
 */
public class FacadeProxy implements InvocationHandler {

    @SuppressWarnings("unchecked")
    public static <T> T newMapperProxy(Class<T> mapperInterface) {
        ClassLoader classLoader = mapperInterface.getClassLoader();
        Class<?>[] interfaces = new Class[]{mapperInterface};
        FacadeProxy proxy = new FacadeProxy();
        return (T) Proxy.newProxyInstance(classLoader, interfaces, proxy);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("call method start");
        System.out.println("method toGenericString:" + method.toGenericString());
        System.out.println("method name:" + method.getName());
        System.out.println("method args:" + args[0]);
        System.out.println("call method end");
        return null;
    }

}
