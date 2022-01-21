package com.yys.demo06_DBUtilsApi;

import com.yys.demo01_自定义连接池.User;
import com.yys.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/01/11:13
 */
public class Demo02 {
    /*
            public queryRunner(DataSource ds);
          query(String sql, ResultSetHandler<T> rsh, Object... params) 执行查询语句
           参数ResultSetHandler是一个接口,表示结果集处理者(对查询结果的封装):
          ResultSetHandler接口的实现类:
            ArrayHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个Object数组中
            ArrayListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个Object数组中,然后把这些数组添加到List集合中
            BeanHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个javaBean对象中
            BeanListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个javaBean对象中,然后把这些javaBean对象添加到List集合中
            ColumnListHandler:适合查询结果是单列多行的,会把该列的所有数据存储到List集合中
            KeyedHandle:适合查询结果是多条记录的,会把每条记录的数据封装到一个Map集合中,然后把这些Map集合添加到另一个Map集合中
            MapHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个Map集合中
            MapListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个Map集合中,然后把这些Map集合添加到List集合中
            ScalarHandler:适合查询结果是单个值的,会把这个值封装成一个对象
     */
    //查询一条数据,放到数组里
    @Test
    public void select01() throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        Object[] arr = qr.query("select * from user where id = ?", new ArrayHandler(), 4);
        System.out.println(Arrays.toString(arr));
    }

    //查询结果是一条记录,把他放在数组里面-javaBean
    @Test
    public void select02() throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        User user = qr.query("select * from user where id = ?", new BeanHandler<User>(User.class), 4);
        System.out.println(user);
    }

    //查询结果是一条记录,把他放在Map集合中
    @Test
    public void select03() throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        Map<String, Object> map = qr.query("select * from user where id = ?", new MapHandler(), 4);
        System.out.println(map);
    }

    //查询结果是多条记录,把他放到数组里面
    @Test
    public void select4() throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        List<Object[]> list = qr.query("select * from user", new ArrayListHandler());
        for (Object[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }
    }

    //查询结果是多条记录,把他放到JavaBean中
    @Test
    public void select5() throws SQLException {
        //创建QueryRunner对象,传入连接池
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        List<User> users = qr.query("select * from user", new BeanListHandler<User>(User.class));
        System.out.println(users);
    }

    //查询结果是多条记录,放到Map集合中
    @Test
    public void select6() throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        List<Map<String, Object>> list = qr.query("select * from user", new MapListHandler());
        for (Map<String,Object> map: list) {
            System.out.println(map);
        }
    }

    //查询结果是多条记录,把他放在集合中
    @Test
    public void select7() throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        //相当于把一个Map1集合放到另一个Map2集合中,map1相当于map2的values
        Map<Object, Map<String, Object>> map = qr.query("select * from user", new KeyedHandler());
        Set<Object> keys = map.keySet();//获取键
        for (Object key : keys) {
            Map<String, Object> map1 = map.get(key);//通过键获取值
            System.out.println(key+"="+map1);
    }
    }
    //查询结果单列多行,---ColumnListHandler
    @Test
    public void select8() throws SQLException {
        //创建QueryRunner对象
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        List<Object> list = qr.query("select username from user", new ColumnListHandler());
        System.out.println(list);
    }

    //查询结果为单个值,封装成对象(统计个数)
    @Test
    public void select9() throws SQLException {
        QueryRunner qr = new QueryRunner(DruidUtils.getDataSource());
        Object count = qr.query("select count(*) from user", new ScalarHandler());
        System.out.println(count);
    }
}
