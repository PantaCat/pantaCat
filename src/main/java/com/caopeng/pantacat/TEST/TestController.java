package com.caopeng.pantacat.TEST;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@RestController
@RequestMapping(value = "/cat")
public class TestController {

    @RequestMapping("/test")
    public HashMap<String,Object> test() throws IOException {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("test/test.json");
        String str = IOUtils.toString(is,"utf-8");
        //return "<p style='white-space: pre-line;'>"+str+"</p>";

        //这种方式json字符串转json对象后，顺序是乱的
        //return JSONObject.parseObject(str).toJSONString();

        //这种转换不改变参数顺序
        HashMap hm = JSONObject.parseObject(str, LinkedHashMap.class, Feature.OrderedField);
        System.out.println(hm.toString());
        return hm;
    }



    public static void main(String[] args) {
//        float c = 1.0f - 0.9f;
//        float d = 0.7f - 0.6f;
//        System.out.println(c == d);
//
//        BigDecimal a = new BigDecimal("1.0");
//        BigDecimal b = new BigDecimal("0.9");
//        BigDecimal e = new BigDecimal("0.8");
//
//        BigDecimal f = a.subtract(b);
//        BigDecimal g = b.subtract(e);
//        System.out.println(f.compareTo(g));
//        System.out.println("abd".compareTo("abc"));

          Float a = 0.1f;
          BigDecimal b = new BigDecimal("10");
          BigDecimal c = new BigDecimal("3");
          System.out.println(b.divide(c,BigDecimal.ROUND_HALF_UP));
          System.out.println(b.divide(c, RoundingMode.UNNECESSARY));


          try{
              //调用servcie
          }catch (Exception e){
              //异常信息
              e.printStackTrace();
              //存日志表动作
          }
    }
}
