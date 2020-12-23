package com.ssm.dao;

import com.ssm.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 课程dao接口
 */
@Repository
@Mapper
public interface CourseDao {

    public List<Course> findBySchool();
    public List<Course> findBySchool1(String arg1);
    public List<Course> findByCategory();
    public List<Course> findByCategory1(String sn);
    public List<Course> findByName(String s);
    public List<Course> findTop5();
    public Integer findById(Integer cid);
    public void updateCourseByAttend(@Param("attend") Integer attend, @Param("cid") Integer cid);
    //显示该用户参加的课程（课程名、学校名称、专业名称、课程详情）
    public List<Course> showAttend(Integer uid);
}
