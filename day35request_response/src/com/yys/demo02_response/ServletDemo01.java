package com.yys.demo02_response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/15:17
 * response作用1.:设置响应行的数据
 * 设置响应行状态码,常见状态码:
 * 200 : 成功
 * 302 : 重定向
 * 304 : 访问缓存
 * 403 : 服务器拒绝处理请求
 * 404 : 请求路径错误
 * 500 : 服务器错误(一般是你的代码错了)
 *
 */
@WebServlet("/d1")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //403:服务器拒绝处理请求
        response.setStatus(403);
        System.out.println("...........");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
