package com.caopeng.pantacat.例子.第一篇章.基础;

public abstract class 抽象类 {
    public String str;

    public void a(){
        System.out.println("a");
    }

    public static void main(String[] args) {
        抽象类 a = new 抽象类() {
            @Override
            public void a() {
                super.a();
                System.out.println("aa");
            }
        };
        a.a();
    }
}
