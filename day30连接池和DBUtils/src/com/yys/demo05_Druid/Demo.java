package com.yys.demo05_Druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.yys.demo01_自定义连接池.User;
import com.yys.utils.C3P0Utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/9:10
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.创建连接池
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");//开启驱动
        dataSource.setUrl("jdbc:mysql://localhost:3306/day29");//连接数据库路径
        dataSource.setUsername("root");//数据库用户名
        dataSource.setPassword("123456");//数据库密码

        //3.根据连接池获取Connection对象
        DruidPooledConnection connection = dataSource.getConnection();
        //4.创建预编译sql语句对象
        String sql = "select * from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        //5.设置参数\
        ps.setInt(1,1);
        //6.执行sql,处理结果
        ResultSet rs = ps.executeQuery();
        User user = null;
        while (rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setNickname(rs.getString("nickname"));
        }
        System.out.println(user);
        //释放资源
        C3P0Utils.release(rs,ps,connection);
    }
}
