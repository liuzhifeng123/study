package com.zhifeng.controller;


import com.zhifeng.domain.User1;
import com.zhifeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class UserLoginControllre {

    @Autowired
    private IUserService iUserService;

    @GetMapping("user_info")
    public User1 A1(){
        return iUserService.getUserInfo();
    }

    @GetMapping("login")
    public  String userLogin(){

        return "A1";
    }

    @GetMapping("")
    public String index(){
        return "index";
    }

    @PostMapping("/insert")
    public String insert(@RequestBody User1 user)
    {
        return iUserService.insertUser(user).toString();
    }

    @GetMapping("delete")
    public  int delete(int id){
         return iUserService.deleUser(id);
    }

    @PostMapping("select")
    public List<User1> select(){
        return iUserService.Listuser();

    }

    @PostMapping("/update")
    public  String update(@RequestBody User1 record){
               iUserService.updateByPrimaryKey(record);
               return "更新成功！！";
    }
}
