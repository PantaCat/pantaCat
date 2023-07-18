package com.caopeng.pantacat.TEST;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import com.caopeng.pantacat.TEST.Dao.TestDao;
import com.caopeng.pantacat.TEST.Dto.TestDto;
import com.caopeng.pantacat.TEST.service.TestService;
import com.caopeng.pantacat.Utils.PaginationBeanUtils;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@RestController
@RequestMapping(value = "/cat")
public class TestController {

    @Autowired
    TestService testService;

    @Resource
    private TestDao testMapper;

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

    @RequestMapping("/test2")
    public String test2(HttpServletRequest request){
//        List<Map> a = testService.testa();
        TestDto testInfo = new TestDto();
        testInfo.setPageNum(1);
        testInfo.setPageSize(2);
        PageInfo xInfo = testService.testb(testInfo);
        request.setAttribute("","");
        return "";
    }

    @RequestMapping("/test3")
    public PageInfo test3(@RequestBody TestDto testInfo){
        System.out.println("进入了test3方法");
        PageInfo xInfo = PaginationBeanUtils.generatePage(() -> testMapper.testd(testInfo),testInfo);
        return xInfo;
    }

//        public static void main(String[] args) throws NacosException {
//            //nacos 地址
//            String serverAddr = "127.0.0.1:8848";
//            //Data Id
//            String dataId = "crm-client";
//            //Group
//            String group = "DEFAULT_GROUP";
//            Properties properties = new Properties();
//            properties.put("serverAddr",serverAddr);
//            ConfigService configService = NacosFactory.createConfigService(properties);
//            //获取配置,String dataId, String group, long timeoutMs
//            String content = configService.getConfig(dataId, group, 5000);
//            System.out.println(content);
//        }

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
