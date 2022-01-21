package com.yys.service;

import com.yys.pojo.User;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/17/9:16
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    void registerUser(User user);

    /**
     * 登录
     * @param user
     * @return 如果返回是null,则登录失败,否则登录登录成功
     */
    User login(User user);
    /**
     * 检查用户名是否可用
     * @param username
     * @return
     * 如果返回true,用户名已存在
     */
    boolean existUserName(String username);
}
