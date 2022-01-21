package com.yys.service.impl;

import com.yys.dao.UserDao;
import com.yys.dao.impl.UserDaoImpl;
import com.yys.pojo.User;
import com.yys.service.UserService;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/17/9:17
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public void registerUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existUserName(String username) {
        if (userDao.queryUserByUserName(username) == null){
            //等于null,说明数据库没有这个用户名,可以用
            return false;
        }
        return true;
    }
}
