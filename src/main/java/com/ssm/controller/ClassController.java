package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/class")
public class ClassController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("这是一个测试方法");
        return "test";
    }
}
