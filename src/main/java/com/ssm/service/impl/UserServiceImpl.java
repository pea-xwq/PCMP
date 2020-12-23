package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
@Mapper
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public User findByTelephone(String telephone) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        List<User> users = userDao.findAllUsers();
        return users;
    }

    @Override
    public void saveUser(User u) {
        userDao.saveUser(u);
    }

    @Override
    public void changeName(String username,Integer id) {
        userDao.changeName(username,id);
    }

    @Override
    public void changePhone(@Param("telephone")String telephone, @Param("id")Integer id) {
        User user = userDao.ifChangePhone(telephone);
        if(user==null){
        userDao.changePhone(telephone,id);
        }else{
            System.out.println("手机号已被注册");
        }
    }

    @Override
    public void changePwd(String password,Integer id) {
        userDao.changePwd(password,id);
    }
}
