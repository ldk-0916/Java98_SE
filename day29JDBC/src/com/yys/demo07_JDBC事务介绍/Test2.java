package com.yys.demo07_JDBC事务介绍;

import com.yys.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/10:00
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        /*
            :zs向ls转钱
         */
        //
        Connection conn = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            //创建预编译
            String sql1 = "update account set money = money - ? where name = ?";
            String sql2 = "update account set money = money + ? where name = ?";
            ps1 = conn.prepareStatement(sql1);
            ps2 = conn.prepareStatement(sql2);
            //设置参数zs-100,
            ps1.setDouble(1,100);
            ps1.setString(2,"zs");
            int rows1 = ps1.executeUpdate();
            System.out.println("受影响的行数:"+rows1);
            System.out.println("---------------------");
            //可能出现的异常
            System.out.println(1/0);
            System.out.println("..........................");
            //ls+100
            ps2.setDouble(1,100);
            ps2.setString(2,"ls");
            int rows2 = ps2.executeUpdate();
            System.out.println("受影响的行数:"+rows2);

            //提交事务
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally{
            JDBCUtils.release(null,null,ps1,conn);
            JDBCUtils.release(null,null,ps2,null);
        }

    }

}
