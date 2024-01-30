package com.caopeng.pantacat.学习;

public class 判断 {

    public static void main(String[] args) {
        Integer i = new Integer(10);
        if(i==1){
            
        }else if(i==2){
            
        }else{
            
        }

        switch (i){
            case 5:
                System.out.println("i=5");
                break; 
            case 10:
                System.out.println("i=10");
                break;
            default:
                System.out.println("null");
        }
        System.out.println(i);
    }
}
