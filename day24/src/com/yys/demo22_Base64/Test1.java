package com.yys.demo22_Base64;

import java.util.Base64;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/11:00
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            mine类型

         */
        //获取编码器:
        Base64.Encoder encoder = Base64.getEncoder();

        //对数据进行编码
        String str = "name = 张三?age = 18";
        String encodeStr = encoder.encodeToString(str.getBytes());
        System.out.println("编码后:"+encodeStr);

        //获取解码器对象
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(encodeStr);
        System.out.println("解码后:"+new String(decode));
    }
}
