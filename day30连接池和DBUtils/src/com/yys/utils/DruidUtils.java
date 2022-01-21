package com.yys.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/9:50
 */
public class DruidUtils {
    private static DataSource dataSource;
    static {
        try {
            Properties pro = new Properties();
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
           // InputStream is = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     */
    public static Connection getConnection() throws Exception {
        Connection conn = dataSource.getConnection();
        return conn;
    }
    public static DataSource getDataSource(){
        return dataSource;
    }

    /**
     * 关闭资源
     * @param rs
     * @param conn
     * @param ps
     */
    public static void closeResource(ResultSet rs, PreparedStatement ps,Connection conn){
        if (ps != null){
            try {
                ps.close();
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
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
