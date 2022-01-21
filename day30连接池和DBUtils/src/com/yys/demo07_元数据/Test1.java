package com.yys.demo07_元数据;

import com.yys.utils.DruidUtils;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/14:27
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        /*
            ParameterMetaData类:
                是一个元数据类,可以用来获取参数的元数据
             使用:
                1.获取元数据类对象:getParameterMetaData()方法
                2.获取参数元数据:
                     ParameterMetaData相关的API
                        int getParameterCount(); 获得参数个数
                        int getParameterType(int param) 获取指定参数的SQL类型。 (注:MySQL不支持获取参数类型)
         */
        //获取连接
        Connection connection = DruidUtils.getConnection();
        //2.创建预编译sql语句
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        //3.获取sql语句的参数的元数据对象
        ParameterMetaData pmd = ps.getParameterMetaData();
        //4.根据元数据对象来获取参数的元数据
        int count = pmd.getParameterCount();//获取参数个数;
        System.out.println("参数个数:"+count);
        //获取参数类型的元数据
        int type = pmd.getParameterType(1);//运行报错,不支持MySql获取参数类型
        System.out.println("参数类型:"+type);
    }
}
