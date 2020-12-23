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
        List<Course> courses = courseDao.findBySchool1(arg1);
        return courses;
    }

    @Override
    public List<Course> findByCategory() {
        List<Course> courses = courseDao.findByCategory();
        return courses;
    }

    @Override
    public List<Course> findByCategory1(String sn) {
        List<Course> courses = courseDao.findByCategory1(sn);
        return courses;
    }

    @Override
    public List<Course> findByName(String s) {
      List<Course> courses = courseDao.findByName(s);
        for(Course c:courses){
            System.out.println(c);
        }
      return courses;

    }


    @Override
    public List<Course> findTop5(){
        List<Course> courses = courseDao.findTop5();
        List<Course> course5 = courses.subList(0,5);
        return course5;
    }

}
