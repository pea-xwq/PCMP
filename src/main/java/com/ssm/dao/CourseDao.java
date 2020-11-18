package com.ssm.dao;

import com.ssm.domain.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseDao {
    @Select({"select * from course"})
    public List<Course> findAll();
}
