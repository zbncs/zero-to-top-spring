package com.itheima.controller;

import com.itheima.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {

    // 原始方式: 通过HttpServletRequest 对象手动获取。
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        //
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//
//        System.out.println(name + " " + age);
//
//        return "ok";
//    }

    // spring boot
//    @RequestMapping("/simpleParam")
//    public String simpleParam(String name, Integer age) {
//
//        System.out.println(name + " " + age);
//        return "ok";
//    }
    // RequestParam 请求参数名
//    @RequestMapping("/simpleParam")
//    public String simpleParam(@RequestParam("name") String username, Integer age) {
//
//        System.out.println(username + " " + age);
//        return "ok";
//    }

    // 参数非必须， require = false
//    @RequestMapping("/simpleParam")
//    public String simpleParam(@RequestParam(name = "name", required = false) String username, Integer age) {
//
//        System.out.println(username + " " + age);
//        return "ok";
//    }

    // 简单实体类参数
//    @RequestMapping("/simplePojo")
//    public String simplePojo(User user) {
//        System.out.println(user);
//
//        return "ok";
//    }

    // 复杂实体类参数
    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);

        return "ok";
    }
    // 数组参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "ok";
    }
    // 集合参数
    // 不加RequestParam 报错：No primary or single unique constructor found for interface java.util.List
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby) {
        System.out.println(hobby);
        return "ok";
    }

    // 日期参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(updateTime);
        return "ok";
    }

    // JSON格式
    @RequestMapping("jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    // 路径参数
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id) {
        System.out.println(id);
        return "ok";
    }


}
