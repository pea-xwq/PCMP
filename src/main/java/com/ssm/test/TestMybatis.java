package com.ssm.test;

import com.ssm.dao.CommentDao;
import com.ssm.dao.CourseDao;
import com.ssm.dao.UserDao;
import com.ssm.domain.Comment;
import com.ssm.domain.Course;
import com.ssm.domain.User;
import com.ssm.service.CourseService;
import com.ssm.service.UserService;
import com.ssm.service.impl.CourseServiceImpl;
import com.ssm.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Controller
public class TestMybatis {

    @Autowired
    private CourseDao courseDao;



    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建Sqlsession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        CourseDao dao = session.getMapper(CourseDao.class);
        //查询所有数据
        List<Course> cs = dao.findTop5();
        //List<Course> cs1 = dao.findByCategory();
        //List<Course> cs2 = dao.findByName("生物");
        //List<Course> cs3 = dao.findBySchool1("上海");
        for (Course c : cs)
            System.out.println(c);
        //关闭资源
        session.close();
        in.close();
    }


    @Test
    public void run2() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建Sqlsession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        CommentDao dao = session.getMapper(CommentDao.class);
        //User u = dao.findById(2);
        //User u = dao.findByTelephone("15172338589");
//        Comment u = new Comment();
//        u.setContent("aa");
//        u.setUid(1);
//        Date date =new Date();
//        u.setTime(date);
//        dao.saveComment(u);
        List<Comment> u = dao.findAllComments();
        session.commit();
        for (Comment uu : u)
            System.out.println(uu);
        //关闭资源
        session.close();
        in.close();

    }

    @Test
    public void run3() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建Sqlsession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        UserDao userDao = session.getMapper(UserDao.class);

        userDao.changePhone("4522342",10);
        //dao.changeName("莉莉乖o", 10);
        //dao.changePwd("341344124",10);
        session.commit();
        session.close();
        in.close();
    }
}
