package com.yys.demo01_操作请求行和请求头;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/14:26
 * request作为域对象在不同的Servlet之间进行数据的共享,它只能在同一次请求中进行数据共享
 *   request域对象只有和请求转发一起使用才有意义
 */
@WebServlet("/demo06")
public class ServletDemo06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = "张三";
        //存入域对象
        request.setAttribute("s",name);//类似于map集合,s就相当于key,name就相当于value
        request.getRequestDispatcher("/demo07").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
