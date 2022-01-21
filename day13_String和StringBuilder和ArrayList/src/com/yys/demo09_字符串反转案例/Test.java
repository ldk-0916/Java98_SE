package com.yys.demo09_字符串反转案例;

import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/10:24
 */
public class Test {
    public static void main(String[] args) {
        //定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果 例如，键盘录入 abc，输出结果 cba
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        String s = reverse(str);
        System.out.println(s);

    }
    public static String reverse(String str){
        String str1 = "";
        for (int i = str.length()-1; i >= 0  ; i--) {
            char c = str.charAt(i);
            str1 += c;//==>str1 = str1+c
        }
        return str1;
    }
}
