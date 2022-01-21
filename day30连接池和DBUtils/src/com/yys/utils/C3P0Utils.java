package com.yys.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/15:56
 */
public class C3P0Utils {
    private static  final ComboPooledDataSource COMBO_POOLED_DATA_SOURCE = new ComboPooledDataSource();

    /**
     * 获得连接
     * @return
     */
    public static Connection getConnection() throws Exception {
        Connection connection = COMBO_POOLED_DATA_SOURCE.getConnection();
        return connection;
    }

    /**
     * 获取连接池的方法
     * @return
     */
    public static ComboPooledDataSource getDataSource(){
        return COMBO_POOLED_DATA_SOURCE;
    }

    /**
     * 释放资源
     * @param rs
     * @param st
     * @param conn
     */
    public static void release(ResultSet rs, Statement st,Connection conn){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st != null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
