package com.caopeng.pantacat.TEST;

import com.caopeng.pantacat.duojicheng.Pig;
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

    @Autowired
    @Qualifier("pig1")
    Pig p1;

    @Resource(name = "pig2")
    Pig p2;

    @Autowired
    Map<String, Pig> pigMap;

    @RequestMapping("/qhj")
    public ModelAndView test1() {
        p1.sj();
        p2.sj();
        Pig p3 = pigMap.get("pig3");
        p3.sj();
        //返回视图方式调用页面
        ModelAndView mv = new ModelAndView("qhj");
        return mv;
    }

    @RequestMapping("/byp")
    public String test2() {
        //返回字符串(templates目录下的页面名称)方式调用页面
        return "qhj";
    }
}
