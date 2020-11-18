package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @RequestMapping("/login")
    public String test(){
        System.out.println("这是一个测试方法");
        return "login";
    }

}
