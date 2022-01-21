package com.yys.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/30/9:18
 */
//@WebFilter("/demo01")
public class FilterDemo01 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FilterDemo01拦截到请求了...");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
