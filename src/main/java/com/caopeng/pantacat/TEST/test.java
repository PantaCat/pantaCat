package com.caopeng.pantacat.TEST;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.RedissonSet;
import org.redisson.api.RSet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class test {

    public static void main(String[] args) {
//        String str = "{'ordernumber':3,'status':0,'describeStr':'描述','imageUrl':1,'skipUrl1':2,'skipUrl2':3,'skipUrl3':4,'skipUrl4':5,'startDate':'2022-08-08T09:47:04','endDate':'2022-08-08T09:47:10','whiteList':6}";
//        JSONObject jsonObj = JSONObject.parseObject(str);
//        System.out.println(jsonObj.toJSONString());

//        System.out.println(new AClass());
//        System.out.println(AClass.value);
//        System.out.println(new AClass[5]);
//          Double a = 123.00;
//          if(a instanceof Object){
//              System.out.println(a);
//          }
        
//        Integer a = 1;
//        Integer b = 2;
//        Integer c = 3;
//        Integer d = 3;
//        Integer e = 123;
//        Integer f = 123;
//        Long g = 3L;
//        System.out.println(c == d);
//        System.out.println(e == f);
//        System.out.println(c == (a+b));
//        System.out.println(c.equals(a+b));
//        System.out.println(g == (a+b));
//        System.out.println(g.equals(a+b));

//        while (1 == 1){
//            System.out.println("a");
//        }
        
//        List a = new ArrayList<>();
//        a.add(null);
//        a.add("123");
//        System.out.println(a.get(0));

//        List<String> str = Arrays.asList("aa","bb");
//        Stream ss = str.stream();
//      //  ss.forEach(a -> System.out.println(a));
//        ss.forEach(System.out::println);
        //format yyyy-MM-dd
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String dateTimeStr = dateTime.format(dateTimeFormatter);
//        System.out.println(dateTimeStr);

        
//        Set<Integer> redisSet =  new HashSet<>();
//        redisSet.add(1);
//        redisSet.add(2);
//        redisSet.add(3);
//        redisSet.add(4);
//        redisSet.add(2);
//        System.out.println(redisSet);
//
//        String s = StringUtils.join(redisSet.stream()
//                .sorted((id1, id2) -> id1.compareTo(id2)).collect(Collectors.toList()), ",");
//        System.out.println(s);
        System.out.println(0.1+0.2);

    }
}
