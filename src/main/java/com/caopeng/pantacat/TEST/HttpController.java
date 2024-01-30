package com.caopeng.pantacat.TEST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Map;


@Controller
@RequestMapping(value = "/cat")
public class HttpController {
    

    @RequestMapping("/qhj")
    public ModelAndView test1() {
        System.out.println("调用HttpController.test1-->开始");
       
        //返回视图方式调用页面
        ModelAndView mv = new ModelAndView("qhj");
        System.out.println("调用HttpController.test1-->结束");
        return mv;
    }

    @RequestMapping("/byp")
    public String test2() {
        //返回字符串(templates目录下的页面名称)方式调用页面
        return "qhj";
    }
}
