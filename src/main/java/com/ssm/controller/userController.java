package com.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {
    @RequestMapping("/changeName")
    public  String  changeName(){

        return ("changeName");
    }

    @RequestMapping("/changePhone")
    public  String  changePhone(){

        return ("changePhone");
    }

    @RequestMapping("/changePwd")
    public  String  changePwd(){

        return ("changePwd");
    }

}
