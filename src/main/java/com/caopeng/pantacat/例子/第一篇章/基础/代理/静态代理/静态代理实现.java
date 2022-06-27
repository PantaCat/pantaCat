package com.caopeng.pantacat.例子.第一篇章.基础.代理.静态代理;

import com.caopeng.pantacat.例子.第一篇章.基础.代理.功能接口;
import com.caopeng.pantacat.例子.第一篇章.基础.代理.功能接口实现;

public class 静态代理实现 implements 功能接口 {

    private 功能接口 gnjk;

    public 静态代理实现(功能接口 gnjk) {
        this.gnjk = gnjk;
    }

    @Override
    public void 天气如何(String str) {
        System.out.println("好烦啊！"+str);
        gnjk.天气如何(str);
        System.out.println("好气啊！"+str);
    }

    public static void main(String[] args) {
        功能接口 a = new 功能接口实现();
        静态代理实现 b = new 静态代理实现(a);
        b.天气如何("下锤子雨!");
    }
}
