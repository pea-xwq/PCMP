package com.ssm.controller;

import com.ssm.domain.Course;

import com.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * web层
 */
@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private CourseService courseService;

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
    @RequestMapping("/comment")
    public String comment(){
        //调用service的方法
        return "comment";
    }
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
