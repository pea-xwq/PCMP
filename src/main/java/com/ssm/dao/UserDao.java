package com.ssm.dao;

import com.ssm.domain.User;
import org.springframework.stereotype.Repository;

/**
 * 用户dao接口
 */
@Repository
public interface UserDao {
    public User findById(Integer id);
    public User findByTelephone(String telephone);
    public User findByEmail(String email);
    public void saveUser(User u);
}
