package com.yys.demo04_C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yys.demo01_自定义连接池.User;
import com.yys.utils.C3P0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/15:40
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        /*
            配置文件放在src目录下
         */
        //创建连接池对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        //获取连接
        Connection connection = dataSource.getConnection();
        //预编译sql语句
        String sql = "select * from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        //设置参数
        ps.setInt(1,1);
        //执行sql
        ResultSet rs = ps.executeQuery();
        User user = null;
        while (rs.next()){
            //创建User对象
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setNickname(rs.getString("nickname"));
        }
        System.out.println(user);
        //7.释放资源
        C3P0Utils.release(rs,ps,connection);
    }
}
