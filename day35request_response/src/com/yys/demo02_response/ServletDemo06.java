package com.yys.demo02_response;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/15/16:32
 */
@WebServlet("/d6")
public class ServletDemo06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //使用字节输入流,读取图片信息
        InputStream is = getServletContext().getResourceAsStream("/img/log.jpg");
        //使用字节输出流,将图片信息响应到浏览器
        ServletOutputStream os = response.getOutputStream();
        System.out.println("会不会出现问呢....");
        //使用循环出去数据
        /*byte[] bys = new byte[1024];
        int len = 0;
        while ((len = is.read(bys)) != -1){
            os.write(bys,0,len);
        }*/
        IOUtils.copy(is,os);
        System.out.println("不会出现错误吗");
        os.close();
        is.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
