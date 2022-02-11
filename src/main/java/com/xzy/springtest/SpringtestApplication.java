package com.xzy.springtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.xzy"})
//@MapperScan("com.xzy.springtest.mapper")
public class SpringtestApplication {

    public static void main(String[] args) {
        System.out.print("输出内容，输出内容内容");
        SpringApplication.run(SpringtestApplication.class, args);    }

}
