package com.ssm.service.impl;

import com.ssm.domain.Course;
import com.ssm.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {
    public List<Course> findAll(){
        System.out.println("查询所有");
        return null;
    }
}
