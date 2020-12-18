package controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class hello {
    @GetMapping("/hello1")
    @RequestMapping("/hello1")   // 路径映射
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        System.out.println("dddddddddddddddddddddd");
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}!", who);
    }
}
