package com.zhifeng.service;

import com.zhifeng.domain.User1;

import java.util.List;

public interface IUserService {

    User1 getUserInfo();
    User1 insertUser(User1 user);
    int deleUser(int id);
    List<User1> Listuser();
    void updateUser(User1 user);
    void  updateByPrimaryKey(User1 record);


}
