package com.yys.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/20/10:42
 */
@WebServlet("/demo01")
public class ServletHtml extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //通过响应回传流回传HTML页面数据
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.write("<!DOCTYPE html>\r\n");
        writer.write("<html lang=\"en\">\r\n");
        writer.write("<head>\r\n");
        writer.write("  <meta charset=\"UTF-8\">\r\n");
        writer.write("  <title>Title</title>\r\n");
        writer.write("</head>\r\n");
        writer.write("<body>\r\n");
        writer.write("这是Html页面数据\r\n");
        writer.write("</body>\r\n");
        writer.write("</html>\r\n");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
