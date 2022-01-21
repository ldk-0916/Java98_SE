package com.yys.demo01_操作请求行和请求头;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/14:29
 */
@WebServlet("/demo07")
public class ServletDemo07 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            request作用对象,只能在服务器内部跳转,作用范围只能是当前servlet,无法直接通过getAttribute获取另一个servlet的数据;
            只能通过请求转发来获取
            servletContext作用域范围更大
         */
        String name = (String) request.getAttribute("s");
        System.out.println("在demo07中获取name的值为:"+name);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
