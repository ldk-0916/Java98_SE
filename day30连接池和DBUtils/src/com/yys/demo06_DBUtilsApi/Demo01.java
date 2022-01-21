package com.yys.demo06_DBUtilsApi;

import com.yys.demo01_自定义连接池.User;
import com.yys.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import java.sql.SQLException;


/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/10:47
 */
public class Demo01 {
    /**
     * 增加一条数据
     */
    @Test
    public void insert() throws Exception {
        //1.创建QueryRunner对象,传入连接
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //调用update方法
        int rows = qr.update("insert into user values(null,?,?,?)", "lsq", "123456", "刘思清");
        if (rows > 0){
            System.out.println("数据添加成功!!!");
        }else {
            System.out.println("数据添加失败...");
        }
        System.out.println("受影响的行数:"+rows);
    }
    /**
     * 删除
     */
    @Test
    public void delete() throws Exception{
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        int rows = qr.update("delete from user where id = ?",5);
        if (rows > 0){
            System.out.println("删除成功...");
        }else{
            System.out.println("删除失败...");
        }
        System.out.println("受影响的行数:"+rows);
    }
    /**
     *  修改
     */
    @Test
    public void update() throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        int rows = qr.update("update user set password = ? where id = ?","12580",4);
        if (rows > 0){
            System.out.println("修改成功...");
        }else{
            System.out.println("修改失败...");
        }
        System.out.println("受影响的行数:"+rows);
    }
    /**
     * 查询
     */
    @Test
    public void select() throws Exception {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        User user = qr.query("select * from user where id = ?", new BeanHandler<>(User.class), 2);
        System.out.println(user);
    }
}
