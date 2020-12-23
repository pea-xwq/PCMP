package com.ssm.controller;

import com.ssm.domain.User;
import com.ssm.service.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"/user"})
public class UserController {
    @Autowired
    private UserService userService;

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
    public  String  updateName(String username,HttpServletRequest request){
        HttpSession session=request.getSession();
        System.out.println(session);
        request.getSession().setAttribute("USER_NAME",username);
        User user= (User) session.getAttribute("USER_SESSION");
        userService.changeName(username,user.getId());
        return ("userCenter");
    }
    @RequestMapping("/updatePhone")
    public  String  updatePhone(String telephone,HttpServletRequest request){
        HttpSession session=request.getSession();
        request.getSession().setAttribute("USER_TALE",telephone);
        System.out.println(session);
        User user= (User) session.getAttribute("USER_SESSION");
        userService.changePhone(telephone,user.getId());
        request.getSession().setAttribute("USER_SESSION",user);
        return ("userCenter");
    }
    @RequestMapping("/updatePass")
    public  String  updatePass(@RequestParam("password") String password,@RequestParam("spassword") String spassword,HttpServletResponse response,HttpServletRequest request) throws IOException {
        if(password.equals(spassword)){
        HttpSession session=request.getSession();
        System.out.println(session);
        User user= (User) session.getAttribute("USER_SESSION");
        userService.changePwd(password,user.getId());
        return ("userCenter");
        }

        else {
            PrintWriter out = null;

            response.setContentType("text/html;charset=UTF-8");
            out = response.getWriter();
            out = response.getWriter();
            out.println("<script>");
            out.println("alert('密码前后不一致')");
            out.println("history.back();");
            out.println("</script>");
            out.close();
            return ("changePwd");
        }

    }

}

