package com.caopeng.pantacat.duojicheng;

import org.springframework.stereotype.Service;

@Service("pig1")
public class Pig1 implements Pig {
    @Override
    public void sj() {
        System.out.println("英文猪在睡觉");
    }
}
