package com.xzy.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    //部分修改，但还是不行
    @RequestMapping("/index")
    public String sayHello(){
        //测试输出了下面的内容
        System.out.print("类方法，执行");
        //应该是提示的：Cannot resolve MVC view 'index'的原因，因为没有配置路径，所以出现问题
        //是否有使用注解就能匹配路径,一般都用xml配置
        return "index";
    }
}
