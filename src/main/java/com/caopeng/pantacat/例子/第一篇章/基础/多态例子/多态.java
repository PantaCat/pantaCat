package com.caopeng.pantacat.例子.第一篇章.基础.多态例子;


public class 多态 {
    public static void main(String[] args) {
        猫 a = new 猫();
        a.抓人();
        猫 b = new 白猫();
        b.抓人();
        多态 d = new 多态();
    }
}
