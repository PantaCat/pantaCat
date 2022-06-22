package com.caopeng.pantacat.例子.第一篇章.基础.泛型例子;

public class 泛型类<T> {
    private String str = "1d";

    public void 泛型方法(T t){
        System.out.println(t);
    }

    public static<T> void 泛型静态方法(T t){
        System.out.println(t);
    }
}
