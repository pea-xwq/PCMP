package com.ssm.dao;

import com.ssm.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户dao接口
 */
@Repository
public interface UserDao {
    public User findById(Integer id);
    public User findByTelephone(String telephone);
    public User findByEmail(String email);
    public List<User> findAllUsers();
    public void saveUser(User u);
}
