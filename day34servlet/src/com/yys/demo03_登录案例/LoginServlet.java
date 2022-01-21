package com.yys.demo03_登录案例;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/14/9:13
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取客户端发送的请求参数:getParameter:获取页面上的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //进行数据校验
        if ("zs".equals(username) && "123456".equals(password)){
            //校验成功
            //页面展示结果
            response.getWriter().write("login success");//响应给客户端的结果
            System.out.println("登录成功!");
        }else{
            response.getWriter().write("login failed");
            System.out.println("登录失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
