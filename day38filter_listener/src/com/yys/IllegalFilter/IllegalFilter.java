package com.yys.IllegalFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/30/13:48
 */
@WebFilter("/*")
public class IllegalFilter implements Filter {
    private List<String> strList = new ArrayList<>();
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       /* //进行非法字符拦截
        //获取客户端输入的内容
        String comment = req.getParameter("comment");
        if (comment != null){
            //判断内容是否合法
            if (comment.contains("你大爷,我草泥马,qnmb")){
                resp.getWriter().write("评论中含有非法字符,请重新评论");
                return;
            }
        }*/
       //1.获取客户端输入的内容
        String comment = req.getParameter("comment");
        if (comment != null){
            //遍历集合中每一个字符
            for (String str : strList) {
                if (comment.contains(str)){

                    resp.getWriter().write("******");
                    return;
                }
            }
        }

        //如果没有,则放行
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        //读取文件中的非法字符
        //使用字符流BufferedReader 读取一行
        //字节流读取,转换成字符流,不然会出现输出中文bug
        InputStream is = IllegalFilter.class.getClassLoader().getResourceAsStream("IllegalChar.txt");
        BufferedReader  bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
            String str = null;
            while ((str = bufferedReader.readLine()) != null){
                //每一次循环读取的得到的str,就是一个非法字符串
                strList.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
