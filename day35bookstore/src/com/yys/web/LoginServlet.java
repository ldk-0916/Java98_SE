package com.yys.web;

import com.yys.pojo.User;
import com.yys.service.UserService;
import com.yys.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/20/9:30
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setCharacterEncoding("utf-8");
        //1.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //调用login方法,处理登录业务
        User userLogin = userService.login(new User(null, username, password, null));
        if (userLogin == null){
            //跳转到登录页面
            request.getRequestDispatcher("/pages/user/login.jsp").forward(request,response);
        }else {
            //跳转到登陆成功页面
            request.getRequestDispatcher("/pages/user/login_success.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
