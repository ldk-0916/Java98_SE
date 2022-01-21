package com.yys.code;

import cn.dsna.util.images.ValidateCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/27/15:45
 */
@WebServlet("/checkCode")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建一张验证码图片
        ValidateCode validateCode = new ValidateCode(100,20,4,30);
        //获取验证码图片上的文字
        String code = validateCode.getCode();
        //将生成的验证码保存到session中
        request.getSession().setAttribute("code",code);
        //输出到浏览器
        validateCode.write(response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
