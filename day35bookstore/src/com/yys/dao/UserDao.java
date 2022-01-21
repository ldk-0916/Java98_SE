package com.yys.dao;

import com.yys.pojo.User;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/16/16:12
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 如果返回是null,说明没有这个用户,反之...
     */
     User queryUserByUserName(String username);

    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return
     */
     User queryUserByUsernameAndPassword(String username,String password);
    /**
     * 保存一条用户信息到数据库
     * @param user
     * @return
     * //返回-1表示操作失败,...
     */
     int saveUser(User user);
}
