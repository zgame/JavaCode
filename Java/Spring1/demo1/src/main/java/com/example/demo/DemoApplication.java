package com.example.demo;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    @RequestMapping("/hello")   // 路径映射
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        System.out.println("dddddddddddddddddddddd");
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}!", who);
    }

}
