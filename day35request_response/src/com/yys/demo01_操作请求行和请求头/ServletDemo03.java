package com.yys.demo01_操作请求行和请求头;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/9:58
 */
@WebServlet("/demo03")
public class ServletDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式:
        request.setCharacterEncoding("UTF-8");
        //根据一个参数名,获取一个参数值
        String username = request.getParameter("username");
        System.out.println(username);

        //根据一个参数名,获取多个参数值,(复选框)
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbies));

        //获取所有的参数值
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历出来它的值
        for (Map.Entry<String,String[]> s: parameterMap.entrySet()) {
            System.out.println(s.getKey()+":"+Arrays.toString(s.getValue()));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
