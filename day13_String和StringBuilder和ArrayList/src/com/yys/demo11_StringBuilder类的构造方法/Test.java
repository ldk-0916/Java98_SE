package com.yys.demo11_StringBuilder类的构造方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/11:26
 */
public class Test {
    public static void main(String[] args) {
        /*
            | public StringBuilder()             | 创建一个空白可变字符串对象，不含有任何内容 |
            | public StringBuilder(String str) | 根据字符串的内容，来创建可变字符串对象     |
         */
        //创建一个空白可变字符串对象，不含有任何内容 ""
        StringBuilder sb1 = new StringBuilder();//创建对象
        System.out.println(sb1+"sb1:"+"=");
        System.out.println(sb1.length());//0

        //把不可变的字符串转换成可变的字符串
        String str = "hello-world";
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("sb2:"+sb2);//sb2:hello-world
        System.out.println("sb2的长度:" + sb2.length());
    }
}
