package com.caopeng.pantacat.学习;

import lombok.Data;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * java1.8新特性之集合流Stream
 **/
public class Stream流 {
    /**
     *概述：Stream将要处理的元素集合看作一种流。
     *      在流的过程中，借助Stream API对流中的元素进行操作，比如：筛选、排序、聚合等。
     *
     *集合工具类 CollectionUtils,常用于List
     *
     * StreamApi分为顺序流Stream(流按按顺序操作)，并行流parallelStream(流多线程并行操作，用于对顺序无要求的数据)
     *
     * Stream常见操作  forEach=遍历，filter=筛选
     */


   public void 遍历(){
       System.out.println("----------------------------");
       List<Person> list = Arrays.asList(new Person(1,"暹罗"),new Person(2,"暹罗"));
       //遍历方式1,循环值赋值于变量a,->为固定写法,后面跟随{}大括号,在大括号里写循环逻辑
       list.stream().forEach(a ->{
           System.out.println(a.getId());//输出语句
       });


       System.out.println("----------------------------");
       //遍历方式2,forEach里没有变量，可以放一个方法(1、如果方法是非静态方法，可以先new好放进去，也可以直接在forEach()里new。2、如果是静态方法，只能直接在forEach里引用，并不能用new)
       //没用小知识 System.out::println同理PersonUtil:: functionA  都属于 类名 + :: + 方法名  一种简洁的方法调用方式，配合forEach使用
       //list.stream().forEach(PersonUtil:: functionB);


       System.out.println("----------------------------");
       //用filter过滤后再forEach
       list.stream().filter(a -> "小明".equals(a.getId())).forEach(b ->{
           System.out.println(b.getId());
       });

       list.stream();
   }

    public void 匹配(){
        List<String> list = Arrays.asList("咖啡","暹罗","银渐层","金渐层","橘猫","英短","美短");
        // 匹配第一个
        Optional<String> findFirst = list.stream().findFirst();
        // 匹配任意（适用于并行流，因为顺序流的话，始终匹配的是第一个值）
        Optional<String> findAny = list.parallelStream().findAny();
        // 是否包含符合特定条件的元素
        //anyMatch和filter的()里都是判断，不同的是anyMatch返回boolean,filter用于stream流的数据筛选
        boolean anyMatch = list.stream().anyMatch(a -> "橘猫".equals(a));
        System.out.println("匹配第一个值：" + findFirst.get());
        System.out.println("匹配任意一个值：" + findAny.get());
        System.out.println("是否存在橘猫：" + anyMatch);
    }
    
    public void 转换(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"暹罗"));
        personList.add(new Person(2,"暹罗"));
        personList.add(new Person(3,"暹罗"));

        // 使用Stream API将对象集合转换为id集合
        List<Integer> idList = personList.stream()
                .map(Person::getId)
                .collect(Collectors.toList());

        // 输出id集合
        System.out.println(idList);
    }

    public void 收集(){
        List<Person> oldList = new ArrayList<Person>();
        oldList.add(new Person(1,"小xx"));
        oldList.add(new Person(2,"小xxa"));
        oldList.add(new Person(3,"小aa"));
        oldList.add(new Person(4,"小cc"));

        List<String> newList1 = oldList.stream().filter(a -> a.getName().contains("小")).map(Person::getName).collect(Collectors.toList());
        List<Person> newList2 = oldList.stream().filter(a -> a.getId()>10).collect(Collectors.toList());
        List<String> newList3 = oldList.stream().filter(a -> a.getName().contains("小")).map(b -> b.getName()+"-悬崖之上").collect(Collectors.toList());
        List<Person> newList4 = oldList.stream().filter(a -> a.getName().contains("大")).map(b -> new Person(b.getId(),b.getName()+"-新方式")).collect(Collectors.toList());
        System.out.println(newList1);
        System.out.println(newList2);
        System.out.println(newList3);
        System.out.println(newList4);
    }

    @Test
    public static void main(String[] args) {
        Stream流 test = new Stream流();
        //test.遍历();
        //test.匹配();
        test.转换();
        test.收集();


    }

}

class Person {
    private int id;
    private String name;

    public Person(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
