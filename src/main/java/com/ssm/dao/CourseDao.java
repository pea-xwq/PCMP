package com.ssm.dao;

import com.ssm.domain.Course;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 课程dao接口
 */
@Repository
public interface CourseDao {

    public List<Course> findAllBySchool();
    public List<Course> findAllByCategory();

    public List<Course> findBySchool();
    public List<Course> findByCategory();
    public List<Course> findByName(String s);
}
