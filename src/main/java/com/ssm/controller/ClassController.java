package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/class")
public class ClassController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("这是一个测试方法");
        return "login";
    }
    @RequestMapping("/recommend")
    public String recommend(){

        return "course";
    }
    @RequestMapping("/home")
    public  String  home(){

        return ("home");
    }

    @RequestMapping("/schoolQuery")
    public  String  schoolQuery(){
        return ("schoolQuery");
    }

    @RequestMapping("/courseQuery")
    public  String  courseQuery(){
        return ("courseQuery");
    }


    @RequestMapping("/catQuery")
    public  String  catQuery(){
        return ("catQuery");
    }
    @RequestMapping("/courseQueryResult")

    public String courseQueryResult(){
        return ("courseQuery");
    }
}
