package com.caopeng.pantacat.例子.第一篇章.基础.代理.JDK动态代理;

import com.caopeng.pantacat.例子.第一篇章.基础.代理.功能接口;
import com.caopeng.pantacat.例子.第一篇章.基础.代理.功能接口实现;
import com.caopeng.pantacat.例子.第一篇章.基础.代理.普通方法类;

import java.lang.reflect.Proxy;

public class 获取代理对象的工厂类 {
    public static Object getProxy(Object obj){
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(), // 目标类的类加载
                obj.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个 getClass().getInterfaces()=通过反射获得类的全部方法
                new JDK动态代理类(obj)   // 代理对象对应的自定义 InvocationHandler
        );
    }

    public static void main(String[] args) {
        功能接口 a = (功能接口) 获取代理对象的工厂类.getProxy(new 功能接口实现());
        a.天气如何("大辣鸡！");

        功能接口 b = (功能接口) 获取代理对象的工厂类.getProxy(new 功能接口() {
            @Override
            public void 天气如何(String str) {
                System.out.println("天气是"+str);
            }
        });
        b.天气如何("中垃圾");

        //不能代理普通类
//        普通方法类 c = (普通方法类) 获取代理对象的工厂类.getProxy(new 普通方法类());
//        c.好普通("xxx");
    }
}
