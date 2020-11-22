package com.ssm.controller;

import com.ssm.domain.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping("/class")
public class ClassController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("这是一个测试方法");
        return "test";
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
    public  String  courseQuery(HttpServletRequest request)
    {
        request.getSession().getAttribute("USER_SESSION");
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
    @RequestMapping("/schoolQueryResult")
    public String SchoolQueryResult(Model model){

        List<Course> list=new ArrayList<Course>();
        Course course1=new Course();
        course1.setcName("java");
        course1.setcInfo("大连理工");
        list.add(course1);
        model.addAttribute("courses", list);
        return "schoolQuery";

    }
}
