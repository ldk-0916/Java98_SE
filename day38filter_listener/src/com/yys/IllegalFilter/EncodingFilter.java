package com.yys.IllegalFilter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/30/13:41
 */
@WebFilter("/*")
public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        //解决请求参数乱码
        req.setCharacterEncoding("UTF-8");
        HttpServletResponse resp = (HttpServletResponse) response;
        resp.setContentType("text/html;charset=utf-8");
        //放行
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
