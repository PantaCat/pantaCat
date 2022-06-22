package com.caopeng.pantacat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PantacatApplication {

    public static void main(String[] args) {
        System.out.println("SpringApplication.run");
        SpringApplication.run(PantacatApplication.class, args);
    }

}
