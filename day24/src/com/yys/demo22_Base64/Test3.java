package com.yys.demo22_Base64;

import java.util.Base64;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/11:13
 */
public class Test3 {
    /*
        基本
     */
    //获取编码器
    public static void main(String[] args) {
        Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
        String str = "";
        for (int i = 0; i < 20; i++) {
            str += i+"";
        }
        String encode = mimeEncoder.encodeToString(str.getBytes());
        System.out.println("编码后:"+encode);

        //解码:
        Base64.Decoder mimeDecoder = Base64.getMimeDecoder();
        byte[] decode = mimeDecoder.decode(encode);
        System.out.println("解码后:"+new String(decode));
    }
}
