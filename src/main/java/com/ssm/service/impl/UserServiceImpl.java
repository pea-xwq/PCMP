package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
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
}
