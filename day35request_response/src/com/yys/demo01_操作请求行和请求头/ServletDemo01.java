package com.yys.demo01_操作请求行和请求头;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/9:15
 * - **getMethod()**;获取请求方式
 * - **getRemoteAddr()** ；获取客户机的IP地址(知道是谁请求的)
 * - **getContextPath()**;    获得当前应用工程名(部署的路径);
 * - **getRequestURI();获得请求地址，不带主机名**
 * - **getRequestURL()；获得请求地址，带主机名**
 * - getServerPort()；获得服务端的端口
 * - getQueryString()；获的请求参数(get请求的,URL的?后面的. eg:username=zs&password=123456)
 * - getProtocol():获取请求协议
 */
@WebServlet("/demo01")
public class ServletDemo01 extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求方式
        String method = request.getMethod();
        System.out.println(method);//GET

        //获取客户记机的ip地址
        String address = request.getRemoteAddr();
        System.out.println(address);

        //获得当前项目的工程名(部署的路径)
        String contextPath = request.getContextPath();
        System.out.println(contextPath);// /demo

        String requestURI = request.getRequestURI();
        System.out.println("获得请求地址不带主机名:"+requestURI);

        //
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("获取请求地址,带主机名:"+requestURL);

        //获取服务端的端口
        int serverPort = request.getServerPort();
        System.out.println(serverPort);//:8080

        //获取请求参数
        String queryString = request.getQueryString();
        System.out.println("获取请求参数:"+queryString);

        //获取请求协议
        String protocol = request.getProtocol();
        System.out.println("获取请求协议:"+protocol);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
