package com.yys.web;

import com.yys.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/21/10:59
 */
@WebServlet("/student")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求参数
        //使用for循环模拟学生数据
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            int stu = i + 1;
            studentList.add(new Student(stu,"name"+ stu,18+stu,"phone"+stu));
        }
        //保存学生到作用域
        request.setAttribute("stuList",studentList);
        //请求转发到student.jsp页面
        request.getRequestDispatcher("Student.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
