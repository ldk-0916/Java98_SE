package com.yys.demo05_登录中SQL注入问题解决;

import com.yys.demo01_JDBC快速入门.User;
import com.yys.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/29/15:30
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            PreparedStatement接口:
                概述:预编译SQL语句对象， 是Statement接口的子接口。
                特点:性能比Statement更高
                会把Sql语句预先编译,格式固定
                sql语句中的参数会发生变化，过滤掉用户输入的关键字(or)
              api:
                预编译sql语句
                    Connection接口的方法
                    PreparedStatement preparedStatement(String sql)
                    sql表示预编译的sql语句,如果sql语句有参数通过?来占位
                    ?:占位符
                  例如:  SELECT * FROM user WHERE username = ? AND password = ?
                  prepareStatement.set类型(int i,Object obj);
                  参数1 i 指的就是问号的索引(指第几个问号,从1开始),参数2就是值   eg:  setString(1,"zs");   setString(2,"123456");
         */
                //获取输入的用户名和密码
                    Scanner sc = new Scanner(System.in);
                    System.out.println("请输入用户名:");
                    String username = sc.nextLine();
                    System.out.println("请输入密码:");
                    String password = sc.nextLine();
                    //根据我们输入的用户名和密码去数据库中查询记录(就是看数据库中有没有这条数据)
                    //1.获取连接
                    Connection conn = JDBCUtils.getConnection();
                    //2.创建预编译sql语句对象,对sql进行预编译
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        //3.为sql语句设置参数
        ps.setString(1,username);
        ps.setString(2,password);
        //4.执行sql语句,处理结果
        ResultSet rs = ps.executeQuery();
        User user = null;
        while (rs.next()){
            //创建User对象
            user = new User();
            //给属性赋值
            user.setId(rs.getInt("id"));//把数据库列的数据存储到user对象里面
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setNickname(rs.getString("nickname"));
        }
        //释放资源
        JDBCUtils.release(rs,null,ps,conn);
        System.out.println(user);
        //判断
        if (user != null){
            System.out.println("登陆成功!!!");
        }else{
            System.out.println("登录失败...");
        }
    }
}
