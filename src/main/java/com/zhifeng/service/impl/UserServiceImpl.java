package com.zhifeng.service.impl;

import com.zhifeng.dao.User1Mapper;
import com.zhifeng.domain.User1;
import com.zhifeng.domain.User1Example;
import com.zhifeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private User1Mapper user1Mapper;

    @Override
    public User1 getUserInfo() {
        User1Example user1Example = new User1Example();
        user1Example.createCriteria().andUsernameLike("1");
        return user1Mapper.selectOneByExample(user1Example);
    }

    @Override
    public User1 insertUser(User1 user) {
        user1Mapper.insertUser(user);
        return user;
    }

    @Override
    public int deleUser(int id) {
        user1Mapper.deleUser(id);
        return id;
    }

    @Override
    public List<User1> Listuser() {

        return user1Mapper.Listuser();
    }

    @Override
    public void updateUser(User1 user){
         user1Mapper.updateUser(user);
    }

    @Override
    public void updateByPrimaryKey(User1 record) {
        user1Mapper.updateByPrimaryKey(record);
    }


}
