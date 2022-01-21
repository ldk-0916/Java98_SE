package com.yys.demo02_response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/16:23
 * 解决中文乱码问题
 * response.setContentType("text/html;charset=utf-8");
 *  1. 设置服务器响应的字符集为UTF-8
 *  2. 设置Content-Type响应头的信息为 "text/html;charset=UTF-8"
 *      让浏览器知道了服务器的响应字符集UTF-8，那么浏览器也会使用UTF-8解码
 */
@WebServlet("/d5")
public class ServletDemo05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决响应到页面上中文乱码的问题
        response.setContentType("text/html;charset=utf-8");
        //通过字符流,向浏览器输出一段内容
        //1. writer()方法，只能输出字符串，如果输出int、float等等类型的话，则会有问题
        response.getWriter().write("神州行,我看行,不充话费,看你行不行!");
        //可以输出任意类型
        response.getWriter().print("神州行,我看行,不充话费,看你行不行!!!");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
