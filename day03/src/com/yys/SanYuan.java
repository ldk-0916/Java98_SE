package com.yys;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/22/9:05
 */
public class SanYuan {
    public static void main(String[] args) {
        int a = 10 ,b = 20;
        /**
         * 如果表达式1:a>b条件成立,就会把a赋值给等号左边
         * 如果表达式1:a>b条件不成立,就会把b赋值给等号左边
         */
        int c = a > b ? a : b;
        System.out.println(c);
    }
}
