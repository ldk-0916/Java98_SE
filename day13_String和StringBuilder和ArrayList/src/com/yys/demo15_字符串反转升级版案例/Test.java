package com.yys.demo15_字符串反转升级版案例;

import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/14:58
 */
public class Test {
    public static void main(String[] args) {
        /*
        需求:
                定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
    ​	    例如，键盘录入abc，输出结果 cba
         */
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        /*StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String sbr = sb.toString();
        return sbr;*/
        return new StringBuilder(str).reverse().toString();

    }
}
