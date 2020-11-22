package com.ssm.test;

import com.ssm.service.CourseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        CourseService cs = (CourseService)ac.getBean("courseService");
        //调用方法
        //cs.findAll();

    }
}
