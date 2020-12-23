package com.ssm.dao;

import com.ssm.domain.Attend;
import com.ssm.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AttendDao {

    //点击参加课程按钮，attend表增加一行，course表attend加1（如果已参加则点击无效）
    public void toAttend(@Param("uid") Integer uid, @Param("cid") Integer cid);
    //点击取消课程按钮，attend表减少一行，course表attend减1
    public void cancelAttend(@Param("uid") Integer uid, @Param("cid") Integer cid);
    //查询该用户是否已参加该课程
    public Attend queryAttend(@Param("uid") Integer uid, @Param("cid") Integer cid);
}
