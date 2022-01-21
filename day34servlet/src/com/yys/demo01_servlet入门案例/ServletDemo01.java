package com.yys.demo01_servlet入门案例;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/13/13:39
 *
 * 配置文件方式:servlet的映射路径:目的就是为了能够让浏览器访问servlet
 */
public class ServletDemo01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //读取servlet的初始化参数
        System.out.println("初始化对象被创建了...");
        System.out.println("ServletDemo02的别名"+servletConfig.getServletName());
        //获取初始化参数init-param
        System.out.println("初始化参数username的值"+servletConfig.getInitParameter("username"));
        //获取ServletContext对象
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //查询数据,将数据响应给浏览器
        System.out.println("Hello World....");
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
