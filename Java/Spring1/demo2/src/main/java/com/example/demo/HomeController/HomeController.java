package com.example.demo.HomeController;

import cn.hutool.json.*;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";

    }


    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}!", who);
    }
}