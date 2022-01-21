package com.yys.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/30/9:48
 * doFilter方法:专门用来拦截请求,做权限检查的
 */
public class AdminFilter implements Filter {
    public void destroy() {
        System.out.println("服务器关闭后销毁了...");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //获取session对象
        HttpServletRequest httpServletRequest= (HttpServletRequest)req;
        HttpSession session = httpServletRequest.getSession();
        Object user = session.getAttribute("user");
        //判断
        if (user == null){
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }else{
            //让程序继续往下访问目标资源
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {
       /* System.out.println("初始化了...");
        //1.获取filter的名称
        System.out.println("filter-name的值是:" + config.getFilterName());
        //获取初始化参数init-param
        System.out.println("初始化参数username的值是:" + config.getInitParameter("username"));
        System.out.println("初始化参数password的值是:" + config.getInitParameter("password"));
        //获取ServletContext对象
        System.out.println(config.getServletContext());*/
    }

}
