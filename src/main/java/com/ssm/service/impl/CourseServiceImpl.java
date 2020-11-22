package com.ssm.service.impl;

import com.ssm.dao.CourseDao;
import com.ssm.domain.Course;
import com.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;
//    private ApplicationContext applicationContext;

    @Override
    public List<Course> findBySchool() {
//        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        CourseDao courseDao = applicationContext.getBean(CourseDao.class);
        List<Course> courses = courseDao.findBySchool();
        return courses;
    }

    @Override
    public List<Course> findBySchool1(String arg1, String arg0) {
        return null;
    }

    @Override
    public List<Course> findByCategory() {
        List<Course> courses = courseDao.findByCategory();
        return courses;
    }

    @Override
    public List<Course> findByCategory1(String sn) {
        return null;
    }

    @Override
    public List<Course> findByName(String s) {
//        List<Course> courses = courseDao.findByName();
//        return courses;

        return null;
    }
}
