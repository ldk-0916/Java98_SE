package com.yys.demo01_JDBC快速入门;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/29/9:20
 */
public class Test02 {
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
        //查询到的数据一条一条的数据,可以把他存放到数组/集合,存放到集合
        //创建一个ArrayList集合
        ArrayList<User> list = new ArrayList<>();
        //boolean next = resultSet.next();
        while (resultSet.next()){
            /*
                next():
                    默认情况下:结果集对象的游标在表头的位置
                    每一次调这个next()的时候,游标向下移动一行
                    返回值是boolean类型,如果当前行有数据,返回true,没有数据就返回false

                 get类型(int/String 列名)
                 get类型(int 列的索引);
                 建议使用列名获取
                 如果只想打印,就用Object()就行
                 如果把数据封装到集合中就要具体类型了
             */
            //通过列名获取
           /* System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("username"));
            System.out.println(resultSet.getString("password"));
            System.out.println(resultSet.getString("nickname"));*/

            //通过列的索引获取
           /* System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
            System.out.println(resultSet.getObject(4));*/
            //创建User对象,封装遍历出来的这条记录的每一列的数据
            User user = new User();
            //给他的属性赋值
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setNickname(resultSet.getString("nickname"));
            list.add(user);
        }
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println(list);
    }
}
