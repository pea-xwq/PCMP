package com.ssm.controller;

import com.ssm.domain.User;
import com.ssm.service.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"/user"})
public class UserController {
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

    @RequestMapping("/updateName")
    public  String  updateName(){
        
        return ("userCenter");
    }

}

