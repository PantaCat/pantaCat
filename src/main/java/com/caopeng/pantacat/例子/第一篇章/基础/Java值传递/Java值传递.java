package com.caopeng.pantacat.例子.第一篇章.基础.Java值传递;

public class Java值传递 {
    /**********第一种情况 方法不能修改基本数据类型的参数*****************/
    public void fun1(){
        int n1 = 10;
        System.out.println(n1);
        fun2(n1);
        System.out.println(n1);
    }

    public void fun2(int a){
        a = 20;
    }
    /***********第二种情况 方法能修改对象引用的参数****************/

    public void fun3(){
        Integer[] s1 = {1,2};
        System.out.println(s1[0]);
        fun4(s1);
        System.out.println(s1[0]);
    }

    public void fun4(Integer[] t1){
        t1[0] = 6;
    }

    /***********第三种情况 方法能修改对象引用的参数****************/
    public void fun5(ObjOne a, ObjOne b){
        ObjOne c = a;
        a = b;
        b = c;
        System.out.println("a:" + a.getName());
        System.out.println("b:" + b.getName());
        a.setName("cat1");
    }

    public static void main(String[] args) {

            Java值传递 a = new Java值传递();
            a.fun1();
            ///////////////
            a.fun3();
            ///////////////
            ObjOne d1 = new ObjOne();
            d1.setName("panta1");
            ObjOne d2 = new ObjOne();
            d2.setName("panta2");
            System.out.println("d1:" + d1.getName());
            System.out.println("d2:" + d2.getName());
            a.fun5(d1, d2);
            System.out.println("d1:" + d1.getName());
            System.out.println("d2:" + d2.getName());
    }
}
