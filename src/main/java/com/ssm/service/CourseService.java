package com.ssm.service;

import com.ssm.domain.Course;

import java.util.List;

public interface CourseService {

    public List<Course> findBySchool();
    public List<Course> findBySchool1(String arg1,String arg0);
    public List<Course> findByCategory();
    public List<Course> findByCategory1(String sn);
    public List<Course> findByName(String s);
    public List<Course> findTop5();
}
