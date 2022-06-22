package com.caopeng.pantacat.duojicheng;

import org.springframework.stereotype.Service;

@Service("pig2")
public class Pig2 implements Pig {
    @Override
    public void sj() {
        System.out.println("白猪在睡觉");
    }
}
