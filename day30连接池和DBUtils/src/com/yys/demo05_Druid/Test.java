package com.yys.demo05_Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.yys.demo01_自定义连接池.User;
import com.yys.utils.C3P0Utils;
import com.yys.utils.DruidUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/9:27
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //创建Properties对象
        //Properties pro = new Properties();
        ////加载配置文件
        //InputStream is = Test.class.getClassLoader().getResourceAsStream("druid.properties");
        //pro.load(is);
        //DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

        //获取连接
        //Connection connection = dataSource.getConnection();
        Connection connection = DruidUtils.getConnection();
        //创建预编译sql
        String sql = "select * from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        //设置参数
        ps.setInt(1,2);
        //执行sql
        ResultSet rs = ps.executeQuery();
        User user = null;
        while (rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setNickname(rs.getString("nickname"));
        }
        System.out.println(user);
        //释放资源
        //C3P0Utils.release(rs,ps,connection);
        DruidUtils.closeResource(rs,ps,connection);
    }
}
