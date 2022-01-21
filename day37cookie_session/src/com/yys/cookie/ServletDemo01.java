package com.yys.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/27/9:36
 * 如何清除浏览器中的某一个cookie?
 * 只需要向浏览器存放/设置一个同名,同path和cookie,但是设置它的有效期(maxAge)为0
 */
@WebServlet("/demo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //1.创建Cookie对象
        Cookie cookie = new Cookie("key1","zs");

        //设置有效期
        cookie.setMaxAge(0);
        //设置路径"一般设置当前项目的路径:request.getContextPath()
        cookie.setPath(request.getContextPath());
        //2.通知客户端保存cookie
        response.addCookie(cookie);

        Cookie cookie1 = new Cookie("key2","李四");
        response.addCookie(cookie1);
        response.getWriter().write("Cookie创建成功");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
