package com.caopeng.pantacat.例子.第一篇章.基础.代理.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDK动态代理类 implements InvocationHandler {

    private final Object obj;

    public JDK动态代理类(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理调用对象方法前的操作！");
        Object result = method.invoke(obj, args);
        System.out.println("JDK动态代理调用对象方法后的操作！");
        return result;
    }
}
