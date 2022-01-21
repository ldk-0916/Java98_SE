package com.yys.demo01_正则表达式的概念及演示;

import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/25/9:22
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入qq号码");
        String qq = sc.next();
        System.out.println();
        System.out.println(checkedQQ(qq));
    }

    public static boolean checkedQQ(String qq){
        String regx = "[1-9]\\d{4,14}";
        return qq.matches(regx);
    }
}
