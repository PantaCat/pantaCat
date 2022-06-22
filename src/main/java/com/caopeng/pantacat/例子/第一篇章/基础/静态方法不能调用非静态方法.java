package com.caopeng.pantacat.例子.第一篇章.基础;

public class 静态方法不能调用非静态方法 {
    public int i;
    public static int p;

    public static void a(){
        //i=1; 非法
        //b(); 非法
        p = 1;
    }
    public void b(){
        i = 1;
    }

    public static void main(String[] args) {
        静态方法不能调用非静态方法 a = new 静态方法不能调用非静态方法();
        a.b();//非静态方法调用
        a.a();//对象名.静态方法 这个调用方法不建议使用
        静态方法不能调用非静态方法.a();//类名.方法名 调用静态方法
    }
}
