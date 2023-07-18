package com.caopeng.pantacat.例子.第一篇章.集合.MAP.Utils;

import java.util.Comparator;

public class MyComparatorUtil implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);//升序
        //return o2.compareTo(o1);//降序
    }
}
