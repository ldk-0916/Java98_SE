package com.yys.demo07_统计字符次数案例;

import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/9:20
 */
public class Test {
    public static void main(String[] args) {
        //​	键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        //定义三个变量,分别用来统计大写、小写、数字的出现的次数
        int bigCount = 0;//统计大写
        int smallCount = 0;//统计小写
        int numCount = 0;//统计数字
        for (int i = 0; i < str.length(); i++) {
            //获取每一个字符
            char c = str.charAt(i);
            //进行判断
            if (c >= 'A' && c <= 'Z'){
                bigCount++;
            } else if (c >= 'a' && c <= 'z'){
                smallCount++;
            }else if (c >= '0' && c <= '9'){
                numCount++;
            }
        }
        System.out.println("大写字符个数:"+bigCount);
        System.out.println("小写字符个数:"+smallCount);
        System.out.println("数字字符个数:"+numCount);
    }
}
