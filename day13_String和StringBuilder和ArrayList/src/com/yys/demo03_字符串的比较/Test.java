package com.yys.demo03_字符串的比较;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/14:20
 */
public class Test {
    public static void main(String[] args) {
        /*
            == 号的比较:
                1.如果作为基本数据类型,比较的是数值
                2.作为引用数据类型,比较的是地址值
            String类型的equals方法:
                    public boolean equals(Object anObject) 比较的是两个字符串内容是否相同,区分大小写
            public boolean equalsIgnoreCase 方法的使用:将此字符串与指定的对象比较,忽略大小写

         */
        //==号的比较
        //如果是基本数据类型 比较的是数值
        int num1 = 10;
        int num2 = 10;
        int num3 = 20;
        System.out.println(num1 == num2);//true
        System.out.println(num1 == num3);//false

        System.out.println("=================================");
        //==作为引用数据类型比较,比较的是地址值
        char[] chs = {'a','b','c','d'};//@540
        String str1 = new String(chs);//str1的字符串内容 "abcd"   @542
        String str2 ="abcd"; //str2的内容是 "abcd" @544
        System.out.println(str1 == str2);//比较的是地址值

        System.out.println("-------------------------------------------");

        //比较字符串内容是否相同(区分顺序和到小写)
        System.out.println(str1.equals(str2));//true

        System.out.println("-------------------------------");
        String str3 = "AbCd";
        System.out.println(str1.equalsIgnoreCase(str3));//true
        System.out.println(str2.equalsIgnoreCase(str3));//true
    }
}
