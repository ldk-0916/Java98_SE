package com.yys.demo02_创建字符串对象两种方式的区别;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/11:07
 */
public class Test {
    public static void main(String[] args) {
        /*
            1.通过构造方法创建
                通过new创建的字符串对象,每一次都会new一个新的内存空间,字符串内容相同,但是地址值不同
            2.直接赋值方式创建
                以“”方式给出的字符串，只要字符序列相同(顺序和大小写)，无论在程序代码中出现几次，JVM 都只会建立一个 String 对象，并在字符串常量池中维护
         */
        //1.通过构造方法创建
        char[] chs = {'a','b','c','d','e'};
        String s1 = new String(chs);//内容相同 地址值@543
        String s2 = new String(chs);//内容相同 地址值@544
        System.out.println(s1 == s2);//false ==:作为引用数据类型比较,比较的是地址值

        //2.直接赋值方式创建
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);//true:比较的是地址值

        //字符串一旦被创建,值就不会被更改
        String str5 = "abc";
        str5 += "d";//str5 = str5 + "d";
        System.out.println(str5);
    }
}
