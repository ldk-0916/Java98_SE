package com.yys.demo05_网站访问次数;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/14/14:57
 */
@WebServlet("/count")
public class CountServlet extends HttpServlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException{
        super.init(servletConfig);
        //计数器初始值为0,每访问一次,数值+1
        getServletContext().setAttribute("count",0);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //每一次用户访问我们就统计一次,把访问的此时加起来
        //取出count值
        Integer count = (Integer) getServletContext().getAttribute("count");
        //数值自增操作
        count++;
        //将数值存到作用域ServletContext对象中
        getServletContext().setAttribute("count",count);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
