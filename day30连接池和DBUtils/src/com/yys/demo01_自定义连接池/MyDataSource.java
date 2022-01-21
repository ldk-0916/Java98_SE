package com.yys.demo01_自定义连接池;

import com.yys.utils.JDBCUtils;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/10:55
 */
public class MyDataSource {
    //创建LinkedList集合(池子),用来存储连接
    private static LinkedList<Connection> pools = new LinkedList<>();
    static {
        for (int i = 0; i < 5; i++) {
            try {
                Connection conn = JDBCUtils.getConnection();
                //添加到集合当中
                pools.add(conn);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取连接池中的个数
     * @return
     */
    public static int getCount(){
        return pools.size();
    }

    /**
     * 归还的方法
     * @param connection
     */
    public void addBack(Connection connection){
        pools.addLast(connection);
    }

    /**
     * 获取连接池的方法:
     * 因为我们从连接池拿一个,连接池里面就少一个
     * @return
     */
    public Connection getABC(){
        Connection connection = pools.removeFirst();
        return connection;
    }
}
