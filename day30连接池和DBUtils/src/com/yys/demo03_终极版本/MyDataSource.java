package com.yys.demo03_终极版本;

import com.yys.utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/13:35
 */
public class MyDataSource implements DataSource {
    //创建LinkedList集合,存储连接
    private static LinkedList<Connection> pools = new LinkedList<>();
    static {
        for (int i = 0; i < 5; i++) {
            try {
                Connection conn = JDBCUtils.getConnection();
                pools.add(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取连接池的连接方法
     * @return
     * @throws SQLException
     */
    @Override
    public Connection getConnection() throws SQLException {
        Connection connection = pools.removeFirst();//得到的就是被增强的连接
        //把被增强的连接替换成增强连接
        MyConnection myConnection = new MyConnection(connection,pools);
        return myConnection;
    }

    /**
     * 获取连接的方法
     * @param username
     * @param password
     * @return
     * @throws SQLException
     */
    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    /**
     * 归还连接池
     * @param connection
     */
    public void addBack(Connection connection){
        pools.addLast(connection);
    }

    /**
     * 获取连接池中的个数
     * @return
     */
    public static int getCount(){
        return pools.size();
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
