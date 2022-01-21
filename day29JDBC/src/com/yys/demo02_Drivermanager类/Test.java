package com.yys.demo02_Drivermanager类;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/29/10:41
 */
public class Test {
    public static void main(String[] args) throws Exception {
        /*
            DriverMange类:注册/加载驱动
            com.mysql.jdbc.Driver类:静态代码块
            static {
                    try {
                        java.sql.DriverManager.registerDriver(new Driver());
                    } catch (SQLException E) {
                        throw new RuntimeException("Can't register driver!");
                    }
                }
         */
        // 翻阅源码发现,通过API的方式注册驱动,Driver会new两次,所有推荐这种写法:
        Class.forName("com.mysql.jdbc.Driver");//当前就理解成 可以让com.mysql.jdbc.Driver里面的静态代码块执行
        //getConnection(String url,String username,String password):用来和数据库建立连接
        //url:要连接的数据库路径   jdbc:mysql://IP地址(127.0.0.1/localhost:3306)/数据库名?/参数名=参数值
        //username:要连接的数据库名
        //password:要连接的数据库密码
    }
}
