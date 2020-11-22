package com.ssm.controller;

import com.ssm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }
    @RequestMapping(value = "/registerTest")
    public String registerTest(String userName, String password, String telephone,HttpServletRequest request){
        System.out.println("userName:"+userName);
        System.out.println("password:"+password);
        System.out.println("telephone:"+telephone);
        User user=new User();
        user.setUserName(userName);
        user.setTelephone(telephone);
        user.setPassword(password);
        request.getSession().setAttribute("USER_SESSION",user);
        //些处横板从数据库中获取对用户名和密码后进行判断
        return "home";
    }
    @RequestMapping(value = "/loginTest",method = RequestMethod.POST)

    public String loginTest(String loginPassword, String loginTelephone, Model model, HttpServletRequest request){
        //些处横板从数据库中获取对用户名和密码后进行判断
        if(loginTelephone!=null&&loginPassword!=null){
            User user=new User();
            user.setTelephone(loginTelephone);
            user.setPassword(loginPassword);
            request.getSession().setAttribute("USER_SESSION",user);
            //主页面的跳转方法
            return "home";
        }
        model.addAttribute("msg","用户名或密码错误，请重新登录！");
        return "login";
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String toLogout(){
        return "login";
    }
    @RequestMapping(value = "/userCenter")
    public String userCenter(){

        return "userCenter";
    }
    @RequestMapping(value = "/forgetPwd")
    public String forgetPwd(){

        return "forgetPwd";
    }
}
