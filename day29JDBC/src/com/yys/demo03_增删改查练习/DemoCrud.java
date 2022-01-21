package com.yys.demo03_增删改查练习;

import com.yys.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/29/11:03
 */
public class DemoCrud {
    //向day29数据中的user表增加一条数据
    @Test
    public void insert() throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/day29";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4.执行sql语句,处理结果
        int rows = statement.executeUpdate("insert into user values (null,'tq','123567','田七')");
        System.out.println("受影响的行数:"+rows);
        //释放资源
        statement.close();
        connection.close();
    }

    /**
     * 修改
     */
    @Test
    public void update() throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/day29";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4.执行sql语句,处理结果
        int rows = statement.executeUpdate("update user set password = '111111' where username = 'tq'");
        System.out.println("受影响的行数:"+rows);
        //释放资源
        statement.close();
        connection.close();
    }

    /**
     * 删除
     */
    @Test
    public void delete() throws Exception {
      /*  //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/day29";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4.执行sql语句,处理结果
        int rows = statement.executeUpdate("delete from user where id = 5");
        System.out.println("受影响的行数:"+rows);
        //释放资源
        statement.close();
        connection.close();*/

      //注册驱动获取连接
        Connection conn = JDBCUtils.getConnection();
        //创建执行sql语句对象
        Statement st = conn.createStatement();
        //执行sql,处理结果
        String sql = "delete from user where id = 4 ";
        int rows = st.executeUpdate(sql);
        //关闭资源
        JDBCUtils.release(null,st,null,conn);

    }

    /**
     * 查询某一条数据
     * 查询姓名叫zs,并且密码是123456的
     */
    @Test
    public void select01() throws Exception {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://localhost:3306/day29";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4.执行sql语句,处理结果:查询返回的是结果集
        String sql = "select * from user where username = 'zs' and password = '123456'";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("username"));
            System.out.println(resultSet.getString("password"));
            System.out.println(resultSet.getString("nickname"));
        }
        //释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
