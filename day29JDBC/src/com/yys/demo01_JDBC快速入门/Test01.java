package com.yys.demo01_JDBC快速入门;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/29/10:00
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        //需求:查询所有用户,输出到控制台
        //2.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/day29";
        String username = "root";//数据库的用户名
        String password = "123456";//数据库的密码
        Connection connection = DriverManager.getConnection(url, username, password);
        //4.创建执行sql语句对象
        Statement statement = connection.createStatement();
        //5.执行sql语句,处理结果
        ResultSet resultSet = statement.executeQuery("select * from user ");
        while (resultSet.next()){
            //通过列名获取
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("username"));
            System.out.println(resultSet.getString("password"));
            System.out.println(resultSet.getString("nickname"));

            //通过列的索引获取
           /* System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
            System.out.println(resultSet.getObject(4));*/
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
