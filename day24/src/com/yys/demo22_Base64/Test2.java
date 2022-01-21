package com.yys.demo22_Base64;

import java.util.Base64;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/11:08
 */
public class Test2 {
    public static void main(String[] args) {
        //获取把编码器对象
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        //2.对数据进行编码
        String str = "name = 张三 ? age = 18";
        String encodeUrl = urlEncoder.encodeToString(str.getBytes());
        System.out.println("编码后:"+encodeUrl);

        //获取解码器
        Base64.Decoder urlDecoder = Base64.getUrlDecoder();
        byte[] decode = urlDecoder.decode(encodeUrl);
        System.out.println("解码后:"+new String(decode));
    }
}
