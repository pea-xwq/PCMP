package com.ssm.controller;

import com.ssm.domain.Course;
import com.ssm.domain.User;
import com.ssm.service.AttendService;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/registerController")
public class RegisterController {
    @Autowired
    private UserService userService;
    @Autowired
    private AttendService attendService;
    @RequestMapping({"/registerAndLogin"})
    public String registerAndLogin() {
        return "login";
    }

    @RequestMapping({"/login"})
    public String login(@RequestParam("telephone") String telephone, @RequestParam("password") String password, Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = null;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        List<User> users = this.userService.findAllUsers();
        Iterator var8 = users.iterator();
        User user;
        do {
            if (!var8.hasNext()) {
                out = response.getWriter();
                out.println("<script>");
                out.println("alert('账号或密码有误')");
                out.println("history.back();");
                out.println("</script>");
                out.close();
                return null;
            }
            user = (User)var8.next();
        } while(!user.getTelephone().equals(telephone) || !user.getPassword().equals(password));
        request.getSession().setAttribute("USER_SESSION",user);
        request.getSession().setAttribute("USER_NAME",user.getUserName());
        request.getSession().setAttribute("USER_TALE",user.getTelephone());
        model.addAttribute("telephone", telephone);
        out = response.getWriter();
        out.println("<script>");
        out.println("alert('登陆成功')");
        out.println("</script>");
        return "home";
    }

    @RequestMapping({"/register"})
    public String register(@RequestParam("username") String username, @RequestParam("telephone") String telephone, @RequestParam("password") String password, Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = null;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        User user1 = new User();
        user1.setPassword(password);
        user1.setTelephone(telephone);
        user1.setUserName(username);

        List<User> users = this.userService.findAllUsers();
        Iterator var10 = users.iterator();

        User user;
        do {
            if (!var10.hasNext()) {
                this.userService.saveUser(user1);
                request.getSession().setAttribute("USER_NAME",user1.getUserName());
                request.getSession().setAttribute("USER_TALE",user1.getTelephone());
                request.getSession().setAttribute("USER_SESSION",user1);
                return "home";
            }
            user = (User)var10.next();
        } while(!user.getTelephone().equals(telephone));
        out = response.getWriter();
        out.println("<script>");
        out.println("alert('手机号已被注册！')");
        out.println("history.back();");
        out.println("</script>");
        out.close();
        return null;
    }
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String toLogout(){
        return "login";
    }

    @RequestMapping(value = "/userCenter")
    public String userCenter(Model model,HttpServletRequest request){
        HttpSession session=request.getSession();
        User user= (User) session.getAttribute("USER_SESSION");
        List<Course> courses = attendService.showAttend(user.getId());
        model.addAttribute("courses", courses);
        return "userCenter";
    }

    @RequestMapping(value = "/forgetPwd")
    public String forgetPwd(){

        return "forgetPwd";
    }




}
