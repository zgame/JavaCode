package com.zgme.testweb2.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    // 获取.yml 文件中值
    @Value("${name}")
    private String name;

    // 获取 age
    @Value("${age}")
    private String age;


    @RequestMapping("/hello")   // 路径映射
    public String hello(){
        return "Hello Spring Boot!  " + name + " : " + age;
    }

}
