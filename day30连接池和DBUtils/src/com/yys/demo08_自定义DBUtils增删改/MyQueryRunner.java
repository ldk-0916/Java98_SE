package com.yys.demo08_自定义DBUtils增删改;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/15:15
 */
public class MyQueryRunner {
    private DataSource dataSource;

    public MyQueryRunner(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    /**
     * 增删改
     */
    public int update(String sql,Object...args) throws Exception {
        //1.非空判断
        if (dataSource == null){
            return -1;
        }
        if (sql == null){
            return -1;
        }
        //从DataSource里面获取Connection
        Connection connection = dataSource.getConnection();
        //创建预编译
        PreparedStatement ps = connection.prepareStatement(sql);
        //获得参数元数据对象, 获得参数的个数
        ParameterMetaData pmd = ps.getParameterMetaData();//参数元数据对象
        int count = pmd.getParameterCount();//获取个数
        //遍历
        for (int i = 1; i <= count; i++) {
            //设置参数
            ps.setObject(i,args[i-1]);
        }
        //执行sql
        int rows = ps.executeUpdate();
        //返回结果
        return rows;
    }
}
