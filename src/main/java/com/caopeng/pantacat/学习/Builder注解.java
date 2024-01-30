package com.caopeng.pantacat.学习;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Builder注解 {
    private String name;
    private String age;
    private String sex;

    public static void main(String[] args) {
        Builder注解 o = Builder注解.builder().name("a").age("b").build();
        System.out.println(o.toString());
    }
}
