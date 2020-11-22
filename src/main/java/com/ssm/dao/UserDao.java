package com.ssm.dao;

import com.ssm.domain.User;

public interface UserDao {
    public User findById(Integer id);
    public User findByTelephone(String telephone);
    public User findByEmail(String email);
    public void saveUser(User u);
}
