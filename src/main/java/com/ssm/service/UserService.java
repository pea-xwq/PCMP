package com.ssm.service;

import com.ssm.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserService {
    public User findById(Integer id);
    public User findByTelephone(String telephone);
    public User findByEmail(String email);
    public List<User> findAllUsers();
    public void saveUser(User u);
    public void changeName(@Param("username") String username,@Param("id") Integer id);
    public void changePhone(@Param("telephone")String telephone,@Param("id")Integer id);
    public void changePwd(@Param("password")String password,@Param("id")Integer id);
}
