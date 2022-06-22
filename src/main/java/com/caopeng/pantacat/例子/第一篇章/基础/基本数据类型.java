package com.caopeng.pantacat.例子.第一篇章.基础;

import java.util.List;

public class 基本数据类型 {
     //成员变量 存放在堆中 有初始值
     Boolean bool1;
     boolean bool2;

    public void 基本数据类型和包装类型(){
        //局部变量 存放在栈中 无初始值
        //4个整型
        byte a1 = -128;//取值范围 -127~127  占1个字节
        byte a2 = 127;
        short b1 = -32768;//取值范围 -32768~32767  占2个字节
        short b2 = 32767;
        int c1 = -2147483648;//取值范围 -2147483648~2147483647 占4个字节
        int c2 = 2147483647;
        long d1 = -9223372036854775808l;//取值范围 -9223372036854775808l~9223372036854775807  占8额字节
        long d2 = 9223372036854775807l;

        //浮点型
        float e = 0; //占4个字节
        double f = 0; //占8个字节

        //字符类型  占2个字节
        char g = 'a';

        //布尔型 不确定
        boolean h = true;

        //对应的澳洲类型
        Byte aa = a1;
        Short bb = b1;
        Integer cc = c1;
        Long dd = d1;
        Float ee = e;
        Double ff = f;
        Character gg = g;
        Boolean hh = h;
    }

     public void 基本类型和包装类型的区别(){
         //包装类型就是个对象，不赋值=null。基本数据类型不赋值有初始值
         System.out.println("包装类型初始值="+bool1+"  "+"基本类型初始值="+bool2);
         //包装类型可以用于泛型，基本类型不能  List就是个泛型类
         List<Integer> intList;
     }

    public static void main(String[] args) {
//        基本数据类型 j = new 基本数据类型();
//        j.基本类型和包装类型的区别();

        Integer i1 = 40;//缓存机制里的
        Integer i2 = 40;
        Integer i3 = new Integer(40);//新new的对象
        Integer i4 = 130;//超出缓存机制的范围，会新new对象
        Integer i5 = 130;
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i4 == i5);

        long l = i1.longValue();//拆箱方法
        Float f = Float.valueOf(l);//装箱方法
        System.out.println(l);
        System.out.println(f);
    }
}
