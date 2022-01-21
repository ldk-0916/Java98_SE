package com.yys.demo04_ServletContext的功能;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/14/10:40
 *
 * 1. + getAttribute(String name) ;向ServletContext对象的map取数据
 *    + setAttribute(String name, Object object) ;从ServletContext对象的map中添加数据
 *    + removeAttribute(String name) ;根据name去移除数据
 *
 */
@WebServlet("/ServletDemo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = "张三";
        //将他存到ServletContext对象中
        //首先获取这个域对象
        ServletContext servletContext = getServletContext();
        //往域对象中存值:setAttribute()方法
        servletContext.setAttribute("s",username);//类似于map集合,第一个参数就是key,第二个参数就是value

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
