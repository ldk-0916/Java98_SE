package com.yys.demo02正则表达式的基本使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/25/10:50
 */
public class Test04 {
    public static void main(String[] args) {
        /*
                正则表达式-数量词
                     语法示例：
                          1. X? : 0次或1次
                          2. X* : 0次到多次
                          3. X+ : 1次或多次
                          4. X{n} : 恰好n次
                          5. X{n,} : 至少n次
                          6. X{n,m}: n到m次(n和m都是包含的)
         */
        System.out.println("123".matches("\\d{3}"));//true
        System.out.println("12345".matches("\\d*"));//true
        System.out.println("===================================");
        System.out.println("1234".matches("\\d+"));//true
        System.out.println("1234".matches("\\d{3,}"));//true
        System.out.println("1234".matches("\\d{1,5}"));//false

        System.out.println("----------------------------------------------------");
        //验证qq号码：1).5--15位；2).全部是数字;3).第一位不是0
        System.out.println("1234567890987654".matches("[1-9]\\d{8,9}"));//false

    }
}
