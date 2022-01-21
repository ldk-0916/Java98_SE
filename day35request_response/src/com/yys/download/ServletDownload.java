package com.yys.download;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/16/9:21
 */
@WebServlet("/download")
public class ServletDownload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取客户端要下载的文件名
        String fileName = request.getParameter("img/log.jpg");
        //获取文件MINE类型(设置下载文件类型)
        String mimeType = getServletContext().getMimeType(fileName);
        response.setHeader("Content-Type",mimeType);
        //使用字节输入流读取要下载的文件
        InputStream is = getServletContext().getResourceAsStream("img/log.jpg");
        //使用字节输出流,将图片输出到浏览器
        ServletOutputStream os = response.getOutputStream();
        //设置响应方式,指示客户端下载文件
        //给文件编码
        String encode = URLEncoder.encode("img/log.jpg", "UTF-8");
        response.setHeader("Content-Dispostion","attachment;filename="+encode);
        IOUtils.copy(is,os);
        os.close();
        is.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
