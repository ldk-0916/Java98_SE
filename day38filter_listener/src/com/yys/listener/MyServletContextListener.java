package com.yys.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/30/15:46
 * 一、写一个类实现ServletContextListener接口,并重写方法
 * 方法1: contextInitialized()会在ServletContext对象创建的时候执行，也就是在服务器启动的时候
 * 方法2: contextDestroyed()会在ServletContext对象销毁的时候执行，也就是在服务器关闭的时候
 * 二、在web.xml中配置监听器
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("服务器创建了...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("服务器销毁了...");
    }
}
