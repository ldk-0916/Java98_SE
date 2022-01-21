package com.yys.demo06_使用preparedStatement完成CRUD;

import com.yys.demo01_JDBC快速入门.User;
import com.yys.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/9:09
 */
public class Demo {
    //向user表添加一条数据
    @Test
    public void insert() throws Exception {
        //1.加载驱动获取连接
        Connection conn = JDBCUtils.getConnection();

        //2.创建预编译sql语句
        String sql = "insert into user values (null,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        //3.设置参数
        ps.setString(1,"zb");
        ps.setString(2,"123456");
        ps.setString(3,"赵八");
        //4.执行sql
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+rows);
        //释放资源
        JDBCUtils.release(null,null,ps,conn);
    }

    @Test
    public void select() throws Exception {
        //1....
        Connection conn = JDBCUtils.getConnection();
        //2...
        String sql = " select * from user";
        PreparedStatement ps = conn.prepareStatement(sql);
        //3不需要设置参数了..
        //4.执行sql
        ResultSet rs = ps.executeQuery();
        ArrayList<User> list = new ArrayList<>();
        User user = null;
        while (rs.next()){
            //创建User对象,
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setNickname(rs.getString("nickname"));
            list.add(user);
        }
        JDBCUtils.release(rs,null,ps,conn);
        for (User use : list) {
            System.out.println(use);
        }
    }
}
