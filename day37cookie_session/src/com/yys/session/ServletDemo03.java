package com.yys.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/27/15:05
 */
public class ServletDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //获取Session对象
        HttpSession session = request.getSession();
        //设置当前session 3秒后超时
        session.setMaxInactiveInterval(5);//客户端两次请求的最大时长间隔
        response.getWriter().write("当前session3秒后超时");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
