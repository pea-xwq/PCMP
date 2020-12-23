package com.ssm.service.impl;

import com.ssm.dao.AttendDao;
import com.ssm.dao.CourseDao;
import com.ssm.domain.Attend;
import com.ssm.domain.Course;
import com.ssm.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("attendService")
public class AttendServiceImpl implements AttendService {

    @Autowired
    private AttendDao attendDao;
    @Autowired
    private CourseDao courseDao;

    @Override
    public void toAttend(Integer uid, Integer cid) {
        Attend attend = attendDao.queryAttend(uid,cid);
        if(attend==null){
            attendDao.toAttend(uid,cid);
            //attendDao.updateAttend(uid,cid);
            Integer attend_sum = courseDao.findById(cid);
            attend_sum++;
            courseDao.updateCourseByAttend(attend_sum,cid);
        }else{
            System.out.println("您已参与该课程！");
        }
    }

    @Override
    public void cancelAttend(Integer uid, Integer cid) {
        attendDao.cancelAttend(uid,cid);
        Integer attend_sum = courseDao.findById(cid);
        attend_sum--;
        courseDao.updateCourseByAttend(attend_sum,cid);
    }

    @Override
    public List<Course> showAttend(Integer uid) {
       List<Course> courses = courseDao.showAttend(uid);
       for(Course c:courses){
           System.out.println(c);
       }
       return courses;
    }

//    @Override
//    public void updateAttend(Integer cid, Integer attend) {
//
//    }
//
//    @Override
//    public Attend queryAttend(Integer uid, Integer cid) {
//        return null;
//    }
}
