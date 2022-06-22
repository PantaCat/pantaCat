package com.caopeng.pantacat.例子.第一篇章.基础;

import com.caopeng.pantacat.例子.第一篇章.基础.泛型例子.泛型;

import java.io.Serializable;
import java.util.Arrays;

public class 反射 implements Serializable {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("com.caopeng.pantacat.例子.第一篇章.基础.泛型例子.泛型");
        泛型 a = (泛型) c.newInstance();
        a.接口1("反射");
        System.out.println(Arrays.stream(c.getDeclaredFields()).toArray().toString());
        泛型 b = new 泛型();

    }
}
