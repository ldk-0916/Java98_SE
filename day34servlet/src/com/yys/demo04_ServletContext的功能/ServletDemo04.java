package com.yys.demo04_ServletContext的功能;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/14/13:52
 *  使用ServletContext获取web里面的资源文件的真实路径
 *  * 目标: 使用字节输入流，读取smoke.jpg这张图片
 *  *     方法1: FileInputStream
 *  *     方法2: ClassLoader
 *  *     方法3: 使用ServletContext
 *  *
 *  * 在web项目中，将文件转换成流，有两种方式
 *  * 1. 如果文件在resources里面，使用类加载器
 *  * 2. 如果文件在web里面，使用ServletContext
 */
@WebServlet("/ServletDemo04")
public class ServletDemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //动态获取文件部署的路径
        String realPath = getServletContext().getRealPath("img/smoke.jpg");
        System.out.println("文件绝对路径:"+realPath);

        ServletContext servletContext = getServletContext();
        InputStream is = servletContext.getResourceAsStream("img/smoke.jpg");
        System.out.println(is);//java.io.ByteArrayInputStream@6b254f58

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
