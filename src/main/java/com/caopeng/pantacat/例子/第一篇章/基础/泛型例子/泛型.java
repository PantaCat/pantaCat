package com.caopeng.pantacat.例子.第一篇章.基础.泛型例子;

public class 泛型 extends 泛型类 implements 泛型接口<String> {

    private String a = "这是私用全局变量";

    @Override
    public void 接口1(String o) {
        System.out.println(o);
    }

    public void 方法1(){
        System.out.println("方法1");
    }

    public static void main(String[] args) {

        泛型 a = new 泛型();
        //String str= a.str;  父类私有属性只能拥有不能访问
        //System.out.println(str);
        a.泛型方法(123.22);
        a.泛型方法("泛型方法");
        泛型.泛型静态方法('a');
        泛型.泛型静态方法("泛型静态方法");
        a.接口1("泛型接口实现");
    }
}
