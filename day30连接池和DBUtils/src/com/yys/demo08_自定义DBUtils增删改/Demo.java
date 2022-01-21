package com.yys.demo08_自定义DBUtils增删改;

import com.yys.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/15:24
 */
public class Demo {
    @Test
    public void insert() throws Exception {
        MyQueryRunner qr = new MyQueryRunner(DruidUtils.getDataSource());
        int rows = qr.update("insert into user values(null,?,?,?)", "lsq", "123321", "刘总");
        System.out.println("受影响的行数:"+rows);
    }
}
