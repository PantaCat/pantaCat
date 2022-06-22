package com.caopeng.pantacat.duojicheng;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import java.util.Map;


public class PP {

    @Autowired
    @Qualifier("pig2")
    Pig p1;

    @Resource(name = "pig2")
    Pig p2;


    @Autowired
    Map<String, Pig> pigMap;

    public void gg1(){
        Pig p2 = pigMap.get("pig2");
        p2.sj();
    }

    public void gg2(){
        p1.sj();
    }

    public void gg3(){
        p2.sj();
    }

    @Test
    public static void main(String[] args) {
        PP p = new PP();
        p.gg3();
    }
}
