package com.yys.demo02_自定义连接池高级版;

import com.yys.demo01_自定义连接池.User;
import com.yys.utils.JDBCUtils;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/30/13:45
 */
public class Demo {
    @Test
    public void select() throws Exception {
        //创建连接池,获取连接
        DataSource dataSource = new MyDataSource();
        System.out.println("获取连接之前:"+MyDataSource.getCount());

        //获取连接
        Connection connection = dataSource.getConnection();
        System.out.println("获取连接之后:"+MyDataSource.getCount());

        //创建预编译sql对象
        String sql = "select * from user where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        //4.设置参数
        ps.setInt(1,1);

        //5.处理结果
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
        //归还连接
        //dataSource.addBack();//编译报错;
        /*
            因为DataSource接口中没有addBack方法;
         */
        ((MyDataSource)dataSource).addBack(connection);
        //connection.close();默认是销毁的,增强过后,变成归还连接了

        //6.释放资源
        JDBCUtils.release(rs,null,ps,connection);
        System.out.println("归还连接之后:"+MyDataSource.getCount());
    }
}
