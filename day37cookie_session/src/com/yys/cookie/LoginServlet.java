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
 * @Date: 2021/12/27/13:50
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("zsf123".equals(username) && "123456".equals(password)){
            //登陆成功
            Cookie cookie = new Cookie("username",username);
            cookie.setMaxAge(60 * 60 * 24 * 7);//表示你设置的cookie有效期为一周
            response.addCookie(cookie);
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
