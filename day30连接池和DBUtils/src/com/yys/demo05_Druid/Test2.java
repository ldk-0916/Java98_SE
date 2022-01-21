package com.yys.demo05_Druid;

import com.yys.demo01_自定义连接池.User;
import com.yys.utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/10:09
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        //获取连接池对象
        Connection conn = DruidUtils.getConnection();
        //创建预编译sql
        String sql = "select * from user where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
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
        DruidUtils.closeResource(rs,ps,conn);
    }
}
