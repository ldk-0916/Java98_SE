package com.yys.dao.impl;

import com.yys.dao.BaseDao;
import com.yys.dao.UserDao;
import com.yys.pojo.User;
import com.yys.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/16/16:22
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUserName(String username) {
        String sql = "select id,username,password,email from t_user where username = ?";
        return queryForOne(User.class,sql,username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select id,username,password,email from t_user where username = ? and password = ?";
        return queryForOne(User.class,sql,username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(username,password,email) values(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
