package com.caopeng.pantacat.例子.第一篇章.基础.代理.CGLIB动态代理;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class 自定义MethodInterceptor implements MethodInterceptor {
    /**
     * @param o           代理对象（增强的对象）
     * @param method      被拦截的方法（需要增强的方法）
     * @param objects        方法入参
     * @param methodProxy 用于调用原始方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("【增强方法】代理对象正在执行的方法：" + method.getName());
        //调用方法之前，我们可以添加自己的操作
        System.out.println("CGLIB动态代理调用对象方法前的操作！");
        Object object = methodProxy.invokeSuper(o, objects);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("CGLIB动态代理调用对象方法后的操作！");
        return object;
    }
}
