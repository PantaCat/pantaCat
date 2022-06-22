package com.caopeng.pantacat.duojicheng;

import org.springframework.stereotype.Service;

@Service("pig3")
public class Pig3 implements Pig {
    @Override
    public void sj() {
        System.out.println("花猪在睡觉");
    }
}
