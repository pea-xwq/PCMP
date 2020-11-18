package com.ssm.test;

import com.ssm.service.CourseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CourseService cs = (CourseService)ac.getBean("courseService");
        cs.findAll();

    }
}
