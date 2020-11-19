package com.ssm.service;

import com.ssm.domain.Course;

import java.util.List;

public interface CourseService {
    public List<Course> findBySchool();
    public List<Course> findByCategory();
    public List<Course> findByName(String s);

}
