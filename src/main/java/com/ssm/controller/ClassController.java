package com.ssm.controller;

import com.ssm.domain.Comment;
import com.ssm.domain.Course;

import com.ssm.domain.User;
import com.ssm.service.CommentService;
import com.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * web层
 */
@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private CommentService commentService;
    @RequestMapping("/test")
    public String test(){
        System.out.println("这是一个测试方法");
        //调用service的方法
        return "test";
    }

    @RequestMapping("/recommend")
    public String recommend(){
        //调用service的方法
        return "course";
    }
//    @RequestMapping("/comment")
//    public String comment(Model model){
//        //调用service的方法
//        List<Comment> comments =commentService.findAllComments();
//        model.addAttribute("comments", comments);
//        return "comment";
//
//    }
//    @RequestMapping("/commentCommit")
//    public String commentCommit(@RequestParam("content") String content, Model model, HttpServletRequest request, HttpServletResponse response,@RequestHeader(value = "referer", required = false) final String referer) throws IOException {
//        //调用service的方法
//        HttpSession session=request.getSession();
//        System.out.println(session);
//        User user= (User) session.getAttribute("USER_SESSION");
//        if(content.length()!=0){
//            commentService.saveComment(user.getId(),content);
//        }else {
//            PrintWriter out = null;
//            response.setContentType("text/html;charset=UTF-8");
//            out = response.getWriter();
//            out.println("<script>");
//            out.println("alert('评论不能为空！')");
//            out.println("history.back();");
//            out.println("</script>");
//            out.close();
//        }
//        return "redirect:"+referer;
//    }
    @RequestMapping("/home")
    public String home(){
        //调用service的方法
        return "home";
    }

    @RequestMapping("/schoolQuery")
    public String schoolQuery(Model model) {
        //调用service的方法
        List<Course> courses = courseService.findBySchool();
        model.addAttribute("courses", courses);
        for (Course course : courses) {
            System.out.println(course);
        }
        return "schoolQuery";
    }

    @RequestMapping("/courseQuery")
    public  String  courseQuery(HttpServletRequest request)
    {
        request.getSession().getAttribute("USER_SESSION");
        return ("courseQuery");
    }

    @RequestMapping("/catQuery")
    public String catQuery(Model model){
        //调用service的方法
        List<Course> courses = courseService.findByCategory();
        model.addAttribute("courses",courses);
        for(Course course:courses){
            System.out.println(course);
        }
        return "catQuery";
    }


    @RequestMapping("/courseQueryResult")
    public String courseQueryResult(String className,Model model){
        //调用service的方法
        List<Course> courses = courseService.findByName(className);
        model.addAttribute("courses",courses);
        for(Course course:courses){
            System.out.println(course);
        }
        return "courseQuery";
    }

    @RequestMapping("/schoolQueryResult")
    public String SchoolQueryResult(String schoolName,String majorName,Model model){

        //调用service的方法
        List<Course> courses = courseService.findBySchool1(schoolName,majorName);
        model.addAttribute("courses",courses);
        for(Course course:courses){
            System.out.println(course);
        }
        return "schoolQuery";

    }
    @RequestMapping("/CatQueryResult")
    public String CatQueryResult(String majorName,Model model){

        //调用service的方法
        List<Course> courses = courseService.findByCategory1(majorName);
        model.addAttribute("courses",courses);
        for(Course course:courses){
            System.out.println(course);
        }
        return "catQuery";

    }
    @RequestMapping("attend")
    public String attend(int cid,@RequestHeader(value = "referer", required = false) final String referer){
        System.out.println(cid);
        //调用service的方法
        return "redirect:"+referer;


    }
}
