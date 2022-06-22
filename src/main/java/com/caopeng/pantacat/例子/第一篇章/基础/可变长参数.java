package com.caopeng.pantacat.例子.第一篇章.基础;

public class 可变长参数 {

    public void fun1(String... a){
        for(String str:a){
            System.out.println(str);
        }
    }
    public void fun2(String a,String... b){
        for(String str:b){
            System.out.println(str);
        }
    }

    public void fun3(可变长参数... a){

    }

    public static void main(String[] args) {
        可变长参数 a = new 可变长参数();
        a.fun2("a","b","c");
        a.fun2("a");
    }
}
