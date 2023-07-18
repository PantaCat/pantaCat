package com.caopeng.pantacat;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@NacosPropertySource(dataId = "crm-client", autoRefreshed = true)
public class PantacatApplication {

    public static void main(String[] args) {
        System.out.println("SpringApplication.run");
        SpringApplication.run(PantacatApplication.class, args);
    }

}
