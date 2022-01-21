package com.yys.demo07_JDBC事务介绍;

import com.yys.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/9:37
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            Connection接口的API
                setAutoCommit:参数是true或false  如果设置为false，表示关闭自动提交，相当于开启事务; 类似sql里面的 start transaction;
                void commit():提交事务:类似于sql里面的commit
                void rollback():回滚事务:类似于sql里面的rollback
         */
        //zs向ls转账100元素
        //1.主驱动,加载连接
        Connection conn = JDBCUtils.getConnection();
        //2.手动开启事务
        conn.setAutoCommit(false);//自动提交关闭,开启事务
        //3.创建预编译sql语句
        String sql = "update account set money = money - ? where name = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        //4.设置参数
        ps.setDouble(1,100.0);
        ps.setString(2,"zs");
        //5.执行sql处理结果
        int rows = ps.executeUpdate();
        System.out.println("受影响的行数:"+ rows);
        //6.提交事务
        conn.commit();
        //7.关闭资源
        JDBCUtils.release(null,null,ps,conn);
    }
}
