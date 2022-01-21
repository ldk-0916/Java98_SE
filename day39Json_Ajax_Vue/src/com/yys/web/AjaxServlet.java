package com.yys.web;

import com.google.gson.Gson;
import com.yys.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/05/13:56
 */
@WebServlet("/ajaxServlet")
public class AjaxServlet extends BaseServlet {
    protected void javaScriptAjax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ajax请求过来");
        Person person = new Person(1,"法外狂徒张三");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        String personJsonString = gson.toJson(person);
        response.getWriter().write(personJsonString);
    }

    protected void jqueryAjax(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("JqueryAjax请求过来");
        Person person = new Person(1,"法外狂徒张三");

        Gson gson = new Gson();
        //转换成Json字符串
        String personJsonString = gson.toJson(person);
        response.getWriter().write(personJsonString);
    }

    protected void jqueryGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("JqueryGet请求过来");
        Person person = new Person(1,"法外狂徒张三");

        Gson gson = new Gson();
        //转换成Json字符串
        String personJsonString = gson.toJson(person);
        response.getWriter().write(personJsonString);
    }
    protected void jqueryPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("JqueryPost请求过来");
        Person person = new Person(1,"张三");

        Gson gson = new Gson();
        //转换成Json字符串
        String personJsonString = gson.toJson(person);
        response.getWriter().write(personJsonString);
    }

    protected void jqueryGetJson(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("JqueryGetJson请求过来");
        Person person = new Person(1,"张三");

        Gson gson = new Gson();
        //转换成Json字符串
        String personJsonString = gson.toJson(person);
        response.getWriter().write(personJsonString);
    }

    protected void jquerySubmit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("JquerySubmit请求过来");
        System.out.println("用户名:"+request.getParameter("username"));
        System.out.println("密  码:"+request.getParameter("password"));
        Person person = new Person(1,"张三");

        Gson gson = new Gson();
        //转换成Json字符串
        String personJsonString = gson.toJson(person);
        response.getWriter().write(personJsonString);
    }
}
