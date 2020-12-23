package com.ssm.service;

import com.ssm.domain.Attend;
import com.ssm.domain.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttendService {
    public void toAttend(@Param("uid") Integer uid, @Param("cid") Integer cid);
    public void cancelAttend(@Param("uid") Integer uid, @Param("cid") Integer cid);
   // public void updateAttend(@Param("cid") Integer cid,@Param("attend") Integer attend);
   // public Attend queryAttend(@Param("uid") Integer uid, @Param("cid") Integer cid);
   public List<Course> showAttend(Integer uid);
}
