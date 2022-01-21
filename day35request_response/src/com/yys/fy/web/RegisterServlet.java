package com.yys.fy.web;

import com.yys.fy.pojo.User;
import com.yys.fy.utils.DruidUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/17/13:48
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");//响应到页面上的乱码问题
        //获取客户端提交的所有参数
        Map<String, String[]> parameterMap = request.getParameterMap();
        //将数据封装到User对象里面
        User user = new User();
        try {
            BeanUtils.populate(user,parameterMap);
            //使用Dbutis向数据库从插入一条数据
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            String sql = "insert into user values(null,?,?,?,?,?,?,0)";
            queryRunner.update(sql,user.getUsername(),user.getPassword(),user.getNickname(),user.getAddress(),user.getEmail(),user.getGender());
            //注册成功,响应到login.html
            response.sendRedirect("/login.html");//重定向
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().print("注册失败");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
