package com.caopeng.pantacat.例子.第一篇章.基础.代理.CGLIB动态代理;

import com.caopeng.pantacat.例子.第一篇章.基础.代理.JDK动态代理.JDK动态代理类;
import com.caopeng.pantacat.例子.第一篇章.基础.代理.功能接口;
import com.caopeng.pantacat.例子.第一篇章.基础.代理.功能接口实现;
import com.caopeng.pantacat.例子.第一篇章.基础.代理.普通方法类;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class 获取代理对象的工厂类 {
    public static Object getProxy(Class<?> clazz) {
        // 创建动态代理增强类
        Enhancer enhancer = new Enhancer();
        // 设置类加载器
        enhancer.setClassLoader(clazz.getClassLoader());
        // 设置被代理类
        enhancer.setSuperclass(clazz);
        // 设置方法拦截器
        enhancer.setCallback(new 自定义MethodInterceptor());
        // 创建代理类
        return enhancer.create();
    }

    public static void main(String[] args) {
        功能接口 a = (功能接口实现) 获取代理对象的工厂类.getProxy(功能接口实现.class);
        a.天气如何("代理接口实现类1");

        功能接口实现 b = (功能接口实现) 获取代理对象的工厂类.getProxy(功能接口实现.class);
        b.天气如何("代理接口实现类2");

        普通方法类 d = (普通方法类) 获取代理对象的工厂类.getProxy(普通方法类.class);
        d.好普通("可以代理普通类");

    }
}
