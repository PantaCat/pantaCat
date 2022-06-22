package com.caopeng.pantacat.例子.第一篇章.基础;

public class continue和break和return {
    public static void main(String[] args) {
        //continue;跳过当前循环，进入下个循环
        for(int i = 0;i<10;i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

        //return; 结束方法
        for(int i = 0;i<10;i++){
            if(i == 5){
                return;
            }
            System.out.println(i);
        }

        //return; 结束方法并返回值
        System.out.println(toretuen());

        //break; 结束整个循环
        for(int i = 0;i<10;i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
    }

    public static int toretuen(){
        //return; 结束方法并返回值
        for(int i = 0;i<10;i++){
            if(i == 5){
                return 666;
            }
            System.out.println(i);
        }
        return 0;
    }
}
