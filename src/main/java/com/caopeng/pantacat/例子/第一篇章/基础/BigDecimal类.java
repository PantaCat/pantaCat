package com.caopeng.pantacat.例子.第一篇章.基础;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;
import java.util.Objects;

public class BigDecimal类 {
    public void 浮点数精度问题例子(){
        float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);

        BigDecimal c = new BigDecimal("1.0");
        BigDecimal d = new BigDecimal("0.9");
        BigDecimal e = new BigDecimal("0.8");
        BigDecimal x = c.subtract(d);
        BigDecimal y = d.subtract(e);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.equals(y));
        System.out.println(Objects.equals(x,y));
    }

    public void BigDecimal常用加减乘除(){
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        System.out.println(a.add(b));//加
        System.out.println(a.subtract(b));//减
        System.out.println(a.multiply(b));//乘
        System.out.println(a.divide(b,2, RoundingMode.HALF_UP));
        System.out.println(a.divide(b));//除 无法除尽，抛出 ArithmeticException 异常

    }

    public void 其他关注点(){
        //保留几位小数的方法
        BigDecimal a = new BigDecimal("1.23456");
        BigDecimal b = a.setScale(4,BigDecimal.ROUND_HALF_UP);
        System.out.println(b);
        //大小比较  1:a>b  0:a=b -1:a<b
        System.out.println(a.compareTo(b));
        //创建BigDecimal需要注意
        //字符串创建用构造方法 new BigDecimal(String str);
        BigDecimal c = new BigDecimal("10");
        //double 用静态方法 valueOf
        BigDecimal d = BigDecimal.valueOf(0.1f);
        BigDecimal e = new BigDecimal("0.1");
        System.out.println(d);
        System.out.println(e);
    }

    public static void main(String[] args) {
        BigDecimal类 a = new BigDecimal类();
        //a.浮点数精度问题例子();
        //a.BigDecimal常用加减乘除();
        a.其他关注点();

    }
}
