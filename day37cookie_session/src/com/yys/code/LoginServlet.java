package com.yys.code;

import com.yys.pojo.User;
import com.yys.utils.DruidUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/27/15:53
 */
@WebServlet("/logins")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 解决乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
    //    获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //获取验证码
        String checkCode = request.getParameter("checkCode");
        //获取服务器上的验证码,从session里面拿出来
        HttpSession session = request.getSession();
        String code = (String) session.getAttribute("code");
        //验证码校验
        if (code.equalsIgnoreCase(checkCode)){

            try {
                //验证码校验通过
                //通过用户名和密码校验
                //连接数据库校验用户名和密码
                QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
                String sql = "select * from user where username = ? and password = ?";
                User user = queryRunner.query(sql, new BeanHandler<>(User.class),username,password);
                if (user != null){
                    //跳转到成功页面
                    response.sendRedirect("/success.html");
                }else {
                    response.getWriter().write("用户名或密码错误");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else {
            response.getWriter().write("验证码错误");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
