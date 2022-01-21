package com.yys.demo04_C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yys.demo01_自定义连接池.User;
import com.yys.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/15:14
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        //2.创建连接池对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");//加载驱动
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/day29");//连接数据库
        dataSource.setUser("root");//数据库用户名
        dataSource.setPassword("123456");//数据库密码
        dataSource.setInitialPoolSize(5);//初始化连接数量
        //3.根据连接池获取连接
        Connection connection = dataSource.getConnection();

        //4.创建预编译sql语句
        String sql = "select * from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);

        //5.设置参数
        ps.setInt(1,1);

        //6.执行sql语句
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
        JDBCUtils.release(rs,null,ps,connection);
    }
}
