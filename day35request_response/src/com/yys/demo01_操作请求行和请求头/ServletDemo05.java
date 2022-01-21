package com.yys.demo01_操作请求行和请求头;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/14:09
 */
@WebServlet("/demo05")
public class ServletDemo05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求转发,1.地址栏路径不会发生改变,2.不会发起新的请求,3.可以访问WEB-INF中的资源
        //如果访问绝对路径中的资源,一般是要以 " / "
        //相对路径:一般不用 "/" 开头
        request.getRequestDispatcher("/WEB-INF/a.html").forward(request,response);
        System.out.println("星宿老仙,法力无边,神通广大,bug不出现");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
