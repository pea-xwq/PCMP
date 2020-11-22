package com.ssm.controller;

import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 注册登录web层
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping(value = "/login")
//    public String login(@RequestParam("telephone")String telephone,@RequestParam("password")String password,Model model){
//        User user = new User();
//        user.setTelephone(telephone);
//        user.setPassword(password);
//        if(userService.findByCondition(user)!=null){
//            return "home";
//        }
//        return "login";
//    }

    @RequestMapping(value = "/registerAndLogin")
    public String registerAndLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("telephone")String telephone, @RequestParam("password")String password, Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = null;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();

        List<User> users = userService.findAllUsers();
        for(User user:users){
            if(user.getTelephone().equals(telephone)&&user.getPassword().equals(password)){
                model.addAttribute("telephone",telephone);
                //return "home";
                out = response.getWriter();
                out.println("<script>");
                out.println("alert('登陆成功')");
                out.println("</script>");

                return "home";
            }
        }
        out = response.getWriter();
        out.println("<script>");
        out.println("alert('账号或密码有误')");
        out.println("history.back();");
        out.println("</script>");
        out.close();
        return null;
        //return "login";
    }

    @RequestMapping("/register")
    public String register(@RequestParam("username")String username, @RequestParam("telephone")String telephone, @RequestParam("password")String password, Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = null;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();

        User user1 = new User();
        user1.setPassword(password);
        user1.setTelephone(telephone);
        user1.setUserName(username);

        List<User> users = userService.findAllUsers();
        for(User user:users){
            if(user.getTelephone().equals(telephone)){
                out = response.getWriter();
                out.println("<script>");
                out.println("alert('手机号已被注册！')");
                out.println("history.back();");
                out.println("</script>");
                out.close();
                return null;
            }
        }
        userService.saveUser(user1);
        return "home";
    }

//    @RequestMapping("/login")
//    @ResponseBody
//    public Map<String,String> login(@RequestParam("telephone")String telephone, @RequestParam("password")String password, Model model){
//        Map<String, String> map = new HashMap<String, String>();
//
//        String isSuccess = "登陆成功";
//        List<User> users = userService.findAllUsers();
//        for(User user:users){
//            if(user.getTelephone().equals(telephone)&&user.getPassword().equals(password)){
//                model.addAttribute("telephone",telephone);
//                isSuccess = "登陆成功";
//                map.put("data", isSuccess);
//                break;
//            }else {
//                isSuccess = "账号或密码错误";
//                map.put("data",isSuccess);
//            }
//            break;
//        }
//        return map;
//    }


}
