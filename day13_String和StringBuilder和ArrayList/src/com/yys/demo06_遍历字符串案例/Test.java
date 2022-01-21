package com.yys.demo06_遍历字符串案例;

import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/9:11
 */
public class Test {
    public static void main(String[] args) {
        //需求:键盘录入一个字符串，使用程序实现在控制台遍历该字符串
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        //获取字符串长度
        int len = str.length();
        //循环遍历
        for (int i = 0; i < len; i++) {
            //调用charAt方法打印输出
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
