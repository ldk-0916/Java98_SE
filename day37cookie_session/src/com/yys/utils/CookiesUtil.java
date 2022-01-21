package com.yys.utils;

import javax.servlet.http.Cookie;

/**
 * @Author: 夜遊神
 * @Date: 2021/12/27/11:12
 */
public class CookiesUtil {
    public static Cookie createAndSetCookie(String name,String value,int time,String path){
        //1. 创建一个cookie对象，存储键值对
        Cookie cookie = new Cookie(name,value);
        //设置cookie的有效期
        cookie.setMaxAge(time);

        //设置cookie有效路径
        cookie.setPath(path);
        return cookie;
    }
    public static String getCookieValue(String name, Cookie[] cookies){
      String value = null;
      if (cookies != null){

          for (Cookie cookie : cookies) {
              //匹配cookie的name
              if (cookie.getName().equals(name)){
                  //获取匹配对应的value值吗
                  value = cookie.getValue();
              }
          }
      }
      return value;
    }

    public static Cookie findCookie(String name,Cookie[] cookies){
        if (name == null || cookies == null || cookies.length == 0){
            return null;
        }else{
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())){
                    return cookie;
                }
            }
            return null;
        }
    }
}
