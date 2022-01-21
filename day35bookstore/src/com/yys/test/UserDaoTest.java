package com.yys.test;

import com.yys.dao.UserDao;
import com.yys.dao.impl.UserDaoImpl;
import com.yys.pojo.User;
import org.junit.Test;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/16/16:36
 */
public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUserName(){
        if (userDao.queryUserByUserName("admin") == null){
            System.out.println("用户名可用!");
        }else {
            System.out.println("用户名不可用!");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword(){
        if (userDao.queryUserByUsernameAndPassword("admin","admin") == null){
            System.out.println("用户名或者密码错误,登录失败");
        }else {
            System.out.println("查询成功");
        }
    }

    @Test
    public void saveUser(){
        System.out.println(userDao.saveUser(new User(null, "lsq123", "12345", "lsq123@168.com")));
    }
}
