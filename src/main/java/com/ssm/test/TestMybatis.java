package com.ssm.test;

import com.ssm.dao.CourseDao;
import com.ssm.domain.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void run1() throws Exception{
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建Sqlsession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        CourseDao dao = session.getMapper(CourseDao.class);
        //查询所有数据
        //List<Course> cs = dao.findBySchool();
        List<Course> cs = dao.findByCategory();
        for(Course c :cs){
            System.out.println(c);
        }
        //关闭资源
        session.close();
        in.close();

    }
}
