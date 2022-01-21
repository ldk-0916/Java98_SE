package com.yys.demo04_ServletContext的功能;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/14/10:45
 */
@WebServlet("/ServletDemo02")
public class ServletDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建域对象
        ServletContext servletContext = getServletContext();

        //调用getAttribute方法获取域对象的值
        String name = (String) servletContext.getAttribute("s");
        System.out.println("在ServletDemo02中获取的username值为:"+ name);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
