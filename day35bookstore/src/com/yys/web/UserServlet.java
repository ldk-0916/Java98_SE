package com.yys.web;

import com.yys.pojo.User;
import com.yys.service.UserService;
import com.yys.service.impl.UserServiceImpl;
import com.yys.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/22/16:34
 */
@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();
    protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //销毁
        request.getSession().invalidate();
        //重定向首页
        response.sendRedirect("/index.jsp");
        //request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
    /**
     * 处理登录功能
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setCharacterEncoding("utf-8");
        //1.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //调用login方法,处理登录业务
        User userLogin = userService.login(new User(null, username, password, null));
        if (userLogin == null){
            //把错误信息,和回显的表单信息,保存到request作用域中
            request.setAttribute("msg","用户名或密码错误");
            request.setAttribute("username",username);
            //跳转到登录页面
            request.getRequestDispatcher("/pages/user/login.jsp").forward(request,response);
        }else {
            //跳转到登陆成功页面
            //登陆成功
            request.getSession().setAttribute("user",userLogin);
            request.getRequestDispatcher("/pages/user/login_success.jsp").forward(request,response);
        }
    }

    /**
     * 处理注册功能
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        //获取Session中的验证码
        String token = (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        //删除Session中的验证码
        request.getSession().removeAttribute(KAPTCHA_SESSION_KEY);
        //获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String code = request.getParameter("code");
        User user = WebUtils.saveParamToBean(request.getParameterMap(), new User());
        //检查用户名是否可用
        if (token != null && token.equalsIgnoreCase(code)){
            if (userService.existUserName(username)){
                System.out.println("用户名:" + username + "已存在");
                //信息回显,保存到作用域中
                request.setAttribute("msg","用户名已存在");
                request.setAttribute("username",username);
                request.setAttribute("email",email);
                //跳回注册页面
                request.getRequestDispatcher("/pages/user/regist.jsp").forward(request,response);

            }else {
                //调用Service保存到数据库
                userService.registerUser(new User(null,username,password,email));
                //跳转到成功页面
                request.getRequestDispatcher("/pages/user/regist_success.jsp").forward(request,response);
            }

        }else{
            //信息回显,保存到作用域中
            request.setAttribute("msg","验证码错误");
            request.setAttribute("username",username);
            request.setAttribute("email",email);

            System.out.println("验证码"+code+"错误");
            request.getRequestDispatcher("/pages/user/regist.jsp").forward(request,response);
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if("login".equals(action)){
            login(request,response);
        }
        if ("regist".equals(action)){
            regist(request,response);
        }
        if ("logout".equals(action)){
            logout(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
