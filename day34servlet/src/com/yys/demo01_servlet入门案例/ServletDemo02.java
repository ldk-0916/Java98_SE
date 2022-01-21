package com.yys.demo01_servlet入门案例;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/13/13:39
 *
 * 配置文件方式:servlet的映射路径:目的就是为了能够让浏览器访问servlet
 * 方式二:注解方式@WebServlet
 * 了解:一个Servlet可以配置多个映射路径,但是多个servlet不能配置相同的映射路径
 *
 * Servlet三种映射路径方式
 * 1.完整路径匹配:要以"/"开头,类似于"/demo01"那么说明客户端的路径只有"/demo01"的时候,才能访问到在这个servlet  :用的中最多
 * 2.目录匹配:要"/"开头,类似于"/*" 或者"/demo/*"那么客户端访问这个路径,只需要匹配 "/*"之前的就可以了
 * 3.扩展名匹配:一定不要以 "/"开头,类似于 "*.do" 或者 "*.in"那么客户端访问这个servlet只需要匹配后缀即可  :基本不用
 *
 * Servlet生命周期:就是servlet从创建到销毁的过程
 * 1.servlet对象什么时候创建:默认情况下,是第一次有请求访问这个servlet的时候被创建
 * 2........什么时候被销毁:服务器关闭的情况下,或者服务器移除的情况下
 *
 * Servlet生命周期各个不同阶段的所有执行方法
 * init:servlet被创建的时候
 * service方法:每一次发送请求,接收处理请求的时候
 * destory:....销毁的时候执行的方法,执行资源回收/备份的操作
 *
 */
public class ServletDemo02 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //读取servlet的初始化参数
        System.out.println("初始化对象被创建了...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //查询数据,将数据响应给浏览器
        System.out.println("Hello World2....");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        //服务器销毁(服务器关闭的时候才会执行)
        System.out.println("对象被销毁了...");
    }
}
