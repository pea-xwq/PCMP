package com.ssm.service.impl;

import com.ssm.domain.Course;
import com.ssm.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {
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
        return null;
    }
}
