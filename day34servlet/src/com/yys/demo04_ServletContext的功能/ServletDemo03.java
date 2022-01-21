package com.yys.demo04_ServletContext的功能;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/14/13:36
 */
@WebServlet("/ServletDemo03")
public class ServletDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = "大碗宽面.avi";
        //使用ServletContext获取文件mine
        String mimeType = getServletContext().getMimeType(fileName);
        System.out.println("文件mine:"+mimeType);//mine类型video/x-msvideo
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
