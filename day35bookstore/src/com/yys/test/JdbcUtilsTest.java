package com.yys.test;

import com.yys.utils.DruidUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/16/14:35
 */
public class JdbcUtilsTest {
    @Test
    public void testJdbcutils() throws Exception {
        for (int i = 0; i < 50; i++) {
            Connection connection = DruidUtils.getConnection();
            System.out.println(connection);
            DruidUtils.closeResource(connection);
        }
    }
}
