package com.ssm.service;

import com.ssm.domain.User;

import java.util.List;

public interface UserService {
    public User findById(Integer id);
    public User findByTelephone(String telephone);
    public User findByEmail(String email);
    public List<User> findAllUsers();
    public void saveUser(User u);
}
