package com.yys.demo01_自定义连接池;

import com.yys.utils.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/11:09
 */
public class Demo {
    @Test
    public void select() throws Exception {
        //创建连接池,获取连接
        MyDataSource dataSource = new MyDataSource();
        System.out.println("获取连接之前:"+dataSource.getCount());//获取之前:5
        //获取连接
        Connection conn = dataSource.getABC();
        System.out.println("获取连接之后:"+dataSource.getCount());//4个
        //创建预编译sql语句对象
        String sql = "select * from user where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        //设置参数
        ps.setInt(1,1);

        //5.执行sql,处理结果,封装结果
        ResultSet rs = ps.executeQuery();
        User user = null;
        while (rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setNickname(rs.getString("nickname"));
        }

        //归还连接
        dataSource.addBack(conn);
        JDBCUtils.release(rs,null,ps,conn);
        System.out.println("归还连接之后:"+MyDataSource.getCount());
    }
}
