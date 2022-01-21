package com.yys.demo02正则表达式的基本使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/25/11:09
 */
public class Test5 {
    public static void main(String[] args) {
        /*
            正则表达式-分组括号
         */
        String str = "DG8FV-B9TKY-FRT9J-99899-XPQ4G";
        //分成5组: 前面4组的规则是一样的 后面一组单独规则
        System.out.println(str.matches("([A-Z0-9]{5}-){4}[A-Z0-9]{5}"));//true
        // 扩展:正则表达式匹配叠词
        // 哈哈,呵呵,嘿嘿,XX  (.)表示第一组,\\1表示第一组
        System.out.println("哈哈".matches("(.)\\1"));
        //(.)表示第一组,\\1表示第一组出现3次
        System.out.println("哈哈哈哈".matches("(.)\\1{3}"));
        //逼逼赖赖
        System.out.println("逼逼赖赖".matches("(.)\\1(.)\\2"));//true

        //哔哩哔哩
        System.out.println("哔哩哔哩".matches("(..)\\1"));

    }
}
