package com.caopeng.pantacat.学习;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.attoparser.trace.MarkupTraceEvent;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class 日常学习记录 {

//    public static void main(String[] args) {
//        //NumberUtils类，可以转换字符串为数字类型。也可以判断字符串是否为数字。
//        boolean a = NumberUtils.isNumber("a100.03330");
//        Number b = NumberUtils.createNumber("100.03330");
//        System.out.println(a);
//        System.out.println(b);
//    }



//    public static void main(String[] args) {
//        //简单的三目运算
//        String str =null;
//        System.out.println(StringUtils.isNotBlank(str)?str:"小南南");
//    }

    /******************JDK7和JDK8的区别之排序*begin*************************************************************************/
    // 使用 java 7 排序
//    private void sortUsingJava7(List<String> names){
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.compareTo(s2);
//            }
//        });
//    }
//
//    // 使用 java 8 排序
//    private void sortUsingJava8(List<String> names){
//        //JDK8用到了Lambda表达式，简化了代码，使编程更简单
//        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
//    }
//
//    public static void main(String args[]){
//
//        List<String> names1 = new ArrayList<String>();
//        names1.add("Google ");
//        names1.add("Runoob ");
//        names1.add("Taobao ");
//        names1.add("Baidu ");
//        names1.add("Sina ");
//
//        List<String> names2 = new ArrayList<String>();
//        names2.add("Google ");
//        names2.add("Runoob ");
//        names2.add("Taobao ");
//        names2.add("Baidu ");
//        names2.add("Sina ");
//
//        日常学习记录 tester = new 日常学习记录();
//        System.out.println("使用 Java 7 语法: ");
//
//        tester.sortUsingJava7(names1);
//        System.out.println(names1);
//        System.out.println("使用 Java 8 语法: ");
//
//        tester.sortUsingJava8(names2);
//        System.out.println(names2);
//    }
    /******************JDK7和JDK8的区别之排序*end*************************************************************************/


//    public static void main(String[] args) throws ParseException {
//        //时间格式化
//        Date d1 = new Date();
//        System.out.println(d1);
//        LocalDateTime d2 = LocalDateTime.now();//中间加T得时间格式
//        System.out.println(d2);
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
//        Date d3 = ft.parse("2014-03-02 14:55:44");
//
//        System.out.println("格式化后的时间为: " + ft.format(d1));
//        System.out.println("自定义的时间为: " + d3);
//    }


//    public static void main(String[] args) throws IOException {
//        char c;
//        String d;
//        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符, 按下 'q' 键退出。");
//        // 读取字符
//        do {
//            //c = (char) br.read();
//            d = br.readLine();
//            //System.out.println(c);
//            System.out.println(d);
//        } while (!d .equals("q") );
//    }

//    public static void main(String[] args) {
//        //随机小于1的double数
//        System.out.println(Math.random());
//        //Random类生成随机数
//        Random r = new Random();
//        int a = r.nextInt(10000);//10000以下的千位随机数
//        System.out.println(a);
//    }

//    public static void main(String[] args) {
//
//        //支持的类型'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
//        //数字可以循环，字符串只能匹配对应的值
//        switch(0){
//            case 0:
//                System.out.println("0");
//            case 1:
//                System.out.println("1");
//            case 2:
//                System.out.println("2");
//            default:
//                System.out.println("default");
//        }
//
//        switch("java"){
//            case "0":
//                System.out.println("0");
//            case "1":
//                System.out.println("1");
//            case "2":
//                System.out.println("2");
//            default:
//                System.out.println("default");
//        }
//
//        switch(-1){
//            case 1:
//                System.out.println("0");
//            case -1:
//                System.out.println("1");
//            case -2:
//                System.out.println("2");
//            default:
//                System.out.println("default");
//        }
//    }

//    public static void main(String[] args) {
//        String str = "129";
//        if(Integer.parseInt(str) ==129) {
//            System.out.println("xxx");
//        }
//
//        Vector v = new Vector();
//        v.add("1");
//        v.add("2");
//        System.out.println(v.toString());
//
//        List q = new LinkedList();
//        q.add("1");
//        q.add(2.02);
//        q.add('a');
//        System.out.println(q.toString());
//
//        Stack s = new Stack();
//        s.add("a");
//        System.out.println(s.toString());
//        Set set = new HashSet();
//        set.add("a");
//        set.add("s");
//        set.add("a");
//        System.out.println(set.toString());
//
//        Map m = new HashMap();
//        m.put("1",null);
//        System.out.println(m.toString());
//        Iterator i = q.iterator();
//        System.out.println(i.toString());
//
//        Object o = new Object();
//    }


//    public void exception1() throws FileNotFoundException{
//        try{
//            File a = new File("");
//            FileInputStream fs = new FileInputStream(a);
//        }catch(FileNotFoundException e){
//           // e.printStackTrace();
//            System.out.println(e.toString());
//            throw new FileNotFoundException("自定义异常信息");
//        }
//
//    }
//
//    public String exception2() throws FileNotFoundException{
//        try{
//            String a = "a";
//            int b = Integer.parseInt(a);
//            return "a";
//        }catch(Exception e){
//            System.out.println(e.toString());
//            return "b";
//        }finally {
//            return "c";
//        }
//    }
//
//    public void exception3(){
//        try(FileInputStream b = new FileInputStream("a")){
//
//        }catch(Exception e){
//            System.out.println(e.toString());
//        }
//    }
//
//    public static void main(String[] args) {
//        try {
//            日常学习记录 a = new 日常学习记录();
//            //a.exception1();
//            //System.out.println(a.exception2());
//            a.exception3();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//            System.out.println(e.getLocalizedMessage());
//        }
//    }
    public static void main(String[] args) {
        //时间戳
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());

    }

}