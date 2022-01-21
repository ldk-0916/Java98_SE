package com.yys.utils;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/29/13:43
 */
public class JDBCUtils {
    private static String driver;//加载驱动
    private static String url;//连接路径
    private static String username;//数据库用户名
    private static String password;
    static {

        try {
            //1.创建properties对象加载配置文件
            Properties pro = new Properties();
            //2.读取配置文件中的数据
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
            pro.load(is);
            //给对象赋值,通过pro
             url = pro.getProperty("url");
             username = pro.getProperty("username");
             password = pro.getProperty("password");
             driver = pro.getProperty("driver");
             //加载驱动
            Class.forName(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得连接的方法
     * getConnection()
     * @return
     */
    public static Connection getConnection() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    /**
     * 释放资源
     * release()
     */
    public static void release(ResultSet rs, Statement st,PreparedStatement ps,Connection conn){
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
    }
}
