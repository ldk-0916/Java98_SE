package com.yys.demo07_元数据;

import com.yys.utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/14:57
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        /*
                ResultSetMeTaData类:
                    是一个结果集元数据类,可以用来获取结果集元数据
                    使用:
                        1.获取结果集元数据类的对象
                            ResultSet的对象调用getMetaData()方法
                        2.获取结果集的元数据
                            ResultSetMetaData 相关的API
                            - getColumnCount(); 获取结果集中列项目的个数
                            - getColumnName(int column); 获得数据指定列的列名
                            - getColumnTypeName();获取指定列的SQL类型
                            - getColumnClassName();获取指定列SQL类型对应于Java的类型
         */
        //获取连接对象
        Connection connection = DruidUtils.getConnection();
        //创建预编译
        String sql = "select * from user";
        PreparedStatement ps = connection.prepareStatement(sql);
        //处理结果集
        ResultSet rs = ps.executeQuery();
        //获取结果集中的元数据对象
        ResultSetMetaData metaData = rs.getMetaData();
        //获取列的个数
        int count = metaData.getColumnCount();
        System.out.println("结果集列的个数:"+count);

        //获取结果集列名
        for (int i = 1; i <= count; i++) {
            System.out.println(metaData.getColumnName(i));
        }

        //获取指定列的类型
        for (int i = 1; i <= count; i++) {
            System.out.println("列的类型:"+metaData.getColumnTypeName(i));
        }
        System.out.println("-------------------------------");
        for (int i = 1; i <= count ; i++) {
            System.out.println("对应java类型:"+metaData.getColumnClassName(i));
        }
    }
}
