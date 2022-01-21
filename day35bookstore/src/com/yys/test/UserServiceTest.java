package com.yys.test;

import com.yys.pojo.User;
import com.yys.service.UserService;
import com.yys.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/17/10:52
 */
public class UserServiceTest {
    UserService userService = new UserServiceImpl();
    @Test
    public void registUser(){
        userService.registerUser(new User(null,"zsf123","123456","zsf@qq.com"));
    }

    @Test
    public void login(){
        System.out.println(userService.login(new User(null,"zsf123","123456","zsf@qq.com")));
    }
}
