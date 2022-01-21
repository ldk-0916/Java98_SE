package com.yys.cookie;

import com.yys.utils.CookiesUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/27/11:02
 */
@WebServlet("/demo03")
public class ServletDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //1.从Cookie中获取上一次访问的时间
        Cookie[] cookies = request.getCookies();
        //这个"lastTime"就是cookie的key,cookies就是value
        String lastTime = CookiesUtil.getCookieValue("lastTime", cookies);
        if (lastTime == null){
            //说明第一次访问
            response.getWriter().write("你是第一次访问");
        }else{
            //不是第一次访问
            response.getWriter().write("您上一次访问的时间是:"+lastTime);
        }
        //要将当前时间存进cookie中
         lastTime = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss").format(new Date());
        Cookie cookie = CookiesUtil.createAndSetCookie("lastTime", lastTime, 7 * 24 * 60 * 60, request.getContextPath());
        response.addCookie(cookie);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
