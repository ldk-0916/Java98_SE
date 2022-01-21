package com.yys.demo02正则表达式的基本使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/25/9:32
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            语法示例：[] 表示匹配单个字符   ^ 取反    - 范围
                1. [abc\]：代表a或者b，或者c字符中的一个。

                2. [^abc\]：代表除a,b,c以外的任何字符。
                3. [a-z]：代表a-z的所有小写字符中的一个。 左右包含
                4. [A-Z]：代表A-Z的所有大写字符中的一个。
                5. [0-9]：代表0-9之间的某一个数字字符。
                6. [a-zA-Z0-9]：代表a-z或者A-Z或者0-9之间的任意一个字符。
                7. [a-dm-p]：a 到 d 或 m 到 p之间的任意一个字符。
         */
        String str = "aoe";
        //验证这个字符串是否以w开头,以b结尾,中间是sdfsdf中的一个字符
        System.out.println(str.matches("w[sdfsdf]b"));
        System.out.println("qwertyuio".matches("qwertyu[^s]o"));
        System.out.println("has".matches("h[a-z]s"));//true
        System.out.println("has".matches("h[A-Z]s"));//false

        System.out.println("--------------------------------------");

        System.out.println("qwer".matches("q[a-z]er"));//true
        System.out.println("Bad".matches("[a-zA-Z0-9]ad"));//true

        System.out.println("beg".matches("b[a-dm-p]g"));//false
    }
}
