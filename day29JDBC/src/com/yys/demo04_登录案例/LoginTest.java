package com.yys.demo04_登录案例;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.yys.demo01_JDBC快速入门.User;
import com.yys.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/29/14:23
 */
public class LoginTest {
    public static void main(String[] args) throws Exception {
        /*
            在控制台输入用户名和密码,查询数据库,如果数据库存在当前用户,显示登录成功!
        ​	如果数据库不存在当前用户,显示登录失败!
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
        //2.执行sql语句对象
        Statement st = conn.createStatement();
        //3.执行sql语句,处理结果
        String sql = "select * from user where username ='"+username+"' and password = '"+password+"'";
        //String sql1 = "select * from user where username = '"+username+"'and password = '"+password+"' Or true";
        ResultSet rs = st.executeQuery(sql);
        //
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
        JDBCUtils.release(rs,st,null,conn);
        //进行判断
        System.out.println(user);
        if (user != null){
            //显示登录成功
            System.out.println("登陆成功!!!");
        }else{
            System.out.println("登录失败...");
        }
    }
}
