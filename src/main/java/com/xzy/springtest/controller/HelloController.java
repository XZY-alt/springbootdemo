package com.xzy.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    //部分修改，但还是不行
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}
