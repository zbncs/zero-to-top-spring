package com.itheima.controller;

import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

    @RequestMapping("/hello")
    public Result hello() {
        return new Result(1, "success", "hello spring");
    }
}
