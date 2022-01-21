package com.yys.demo02_response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/15:41
 * 重定向和请求转发的对比
 *  1.谁发起的跳转
 *      1.请求转发的跳转是由服务器发起的
 *      2.重定向跳转是由浏览器发起的
 *  2.能跳转的资源
 *      1.请求转只能跳转本项目下的资源
 *      2.重定向可以跳转本项目外的资源
 *  3.能否访问WEB_INF下的资源
 *      1.请求转发是可以访问的
 *      2.重定向不可以的
 *  4.可以发几次请求
 *      1.请求转发只会发起一次请求
 *      2.重定向会发起两次
 *  5.地址栏会不会发生改变
 *      1.请求转发地址栏不会变
 *      2.重定向会发生改变
 *  6.是否能和request作用域对象存取值一起使用
 *   1.请求转发是可以的
 *   2.重定向不可以
 */
@WebServlet("/d3")
public class ServletDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //重定向跳转:让浏览器页面跳转
        //设置响应状态码
        //response.setStatus(200);
        //重定向简单方式
        response.sendRedirect("WEB-INF/a.html");//无法访问WEB-INF下的资源
        //请求转发
        //request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
