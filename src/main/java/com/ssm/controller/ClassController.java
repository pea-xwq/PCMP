package com.ssm.controller;

import com.ssm.domain.Course;
import com.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("/home")
    public String home(){
        //调用service的方法
        return "home";
    }

    @RequestMapping("/schoolQuery")
    public String schoolQuery(Model model){
        //调用service的方法

        List<Course> courses = courseService.findBySchool();
        model.addAttribute("courses",courses);
        for(Course course:courses){
            System.out.println(course);
        }
        return "schoolQuery";
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

    @RequestMapping("/courseQuery")
    public String courseQuery(){
        //调用service的方法
        return "courseQuery";
    }

    @RequestMapping("/courseQueryResult")
    public String courseQueryResult(){
        //调用service的方法
        return "courseQuery";
    }
}
