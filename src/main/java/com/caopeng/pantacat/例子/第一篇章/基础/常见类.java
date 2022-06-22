package com.caopeng.pantacat.例子.第一篇章.基础;

import java.io.Serializable;

public class 常见类 implements Serializable {
    public void object(){
        Object a = new Object();


    }

    public static void main(String[] args) {
        String c = new String("panta");
        String a = "panta";
        String b = "panta";


        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a==b);
        System.out.println(a==c);

    }
}
