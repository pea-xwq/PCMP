package com.ssm.service.impl;

import com.ssm.dao.CourseDao;
import com.ssm.domain.Course;
import com.ssm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> findAllBySchool() {
        List<Course> courses = courseDao.findAllBySchool();
        return null;
    }

    @Override
    public List<Course> findAllByCategory() {
        List<Course> courses = courseDao.findAllByCategory();
        return null;
    }

    @Override
    public List<Course> findBySchool() {
        return null;
    }

    @Override
    public List<Course> findByCategory() {
        return null;
    }

    @Override
    public List<Course> findByName(String s) {
//        List<Course> courses = courseDao.findByName();
//        return courses;

        return null;
    }
}
