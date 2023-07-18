package com.caopeng.pantacat.例子.第一篇章.集合.MAP;

import com.caopeng.pantacat.例子.第一篇章.集合.MAP.Utils.MyComparatorUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map排序 {

    public void 按key排序(){
        Map a = new TreeMap<>(new MyComparatorUtil());
        a.put("g","8");
        a.put("t","1");
        a.put("a","11");
        a.put("l","6");
        System.out.println(a.toString());
    }

    public static void main(String[] args) {
        map排序 a = new map排序();
        a.按key排序();
    }

}