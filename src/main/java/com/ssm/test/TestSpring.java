package com.ssm.test;

import com.ssm.service.CourseService;
import com.ssm.service.UserService;
import com.ssm.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        //CourseService cs = (CourseService)ac.getBean("courseService");
        //调用方法
        //cs.findBySchool();

        UserService userService = (UserService)ac.getBean("userService");
        userService.changePhone("888",10);
    }
}
