package com.caopeng.pantacat.TEST;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

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
}
