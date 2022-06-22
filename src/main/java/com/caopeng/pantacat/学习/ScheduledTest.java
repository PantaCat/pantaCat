package com.caopeng.pantacat.学习;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class ScheduledTest {

    @Scheduled(fixedDelay = 5000)
    public void Test1(){
        System.out.println("这是个定时任务。");
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = a++;
        System.out.println(b);
    }

}
