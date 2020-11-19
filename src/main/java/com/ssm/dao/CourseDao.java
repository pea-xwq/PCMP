package com.ssm.dao;

import com.ssm.domain.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseDao {

    public List<Course> findBySchool();
    public List<Course> findByCategory();
    public List<Course> findByName(String s);
}
