package com.yys.web;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/22/14:12
 * 用来处理上传的数据的
 */
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.判断上传的数据是否是多段的(因为只有多段的,才是文件上传的)
        if (ServletFileUpload.isMultipartContent(request)){
            //创建FileItemFactory工厂实现类
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            //创建解析类,用于解析上传数据的工具类
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            try {
                //解析上传的数据,得到每一个表单项FileItem
                List<FileItem> list = servletFileUpload.parseRequest(request);
                //循环判断,判断当前这个表单项,是否是普通的表单项,还是上传的文件类型
                for (FileItem fileItem : list) {
                    if (fileItem.isFormField()){
                        //普通表单项
                        System.out.println("表单项的name属性的值:"+fileItem.getFieldName());
                        //参数Utf-8,解决乱码
                        System.out.println("表单项的value属性"+fileItem.getString("UTF-8"));
                    }else{
                        //上传的文件
                        System.out.println("表单项的name属性值:"+fileItem.getFieldName());
                        System.out.println("上传的文件名" + fileItem.getName());
                        //这个路径就是你要上传到哪个位置的
                        fileItem.write(new File("D:\\"+fileItem.getName()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
