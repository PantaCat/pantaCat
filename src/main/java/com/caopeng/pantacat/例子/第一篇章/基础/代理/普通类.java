package com.caopeng.pantacat.例子.第一篇章.基础.代理;

public class 普通类 {
    private 功能接口 gnjk;

    public void 天气如何(String str) {
        System.out.println("好烦啊！"+str);
        gnjk.天气如何(str);
        System.out.println("好气啊！"+str);
    }
}
