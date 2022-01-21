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
 * @Date: 2021/12/17/9:48
 */
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");//设置编码格式
        //1.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String code = request.getParameter("code");
        //检验验证码是否正确,给他写死:abcde
            //检查用户名是否可用
                if (userService.existUserName(username)){
                    System.out.println("用户名:"+username+"已存在");
                    request.getRequestDispatcher("/pages/user/regist.jsp").forward(request,response);
                }else {
                    //可用
                    //调用Service保存到数据库
                    userService.registerUser(new User(null,username,password,email));
                    //跳转到成功页面
                    request.getRequestDispatcher("/pages/user/regist_success.jsp").forward(request,response);
                }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
