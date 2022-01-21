package com.yys.demo02_servlet体系结构;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/13/16:39
 *  Servlet的常用的编写方法:
 *  * 1. 写一个类继承HttpServlet，重写doGet和doPost方法
 *  *    1.1 doGet()方法，是处理来自客户端的get请求
 *  *    1.2 doPost()方法，是处理来自客户端的post请求
 *  *
 *  *    通常情况下:服务器端针对同一个请求(不同的请求方式)不会做不同的处理,所以我们会选择在doGet中调用doPost
 */
/*@WebServlet("/demo04")
public class ServletDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("客户端来了一个get请求");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("客户端来了一个post请求");
    }
}*/
