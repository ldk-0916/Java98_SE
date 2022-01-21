package com.yys.demo01_String类的构造方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/10:37
 */
public class Test {
    public static void main(String[] args) {
        /*
              构造方法通过new来调用
              成员方法:
                   非静态成员方法:通过对象名来调用
                   静态成员方法:通过类名来调用
              方法:
                   无返回值:直接调用
                  有返回值:
                       直接调用
                       赋值调用
                       输出调用

            public String():初始化新创建的 String对象，使其表示空字符序列。
            public   String(char[] chs) 根据字符数组的内容，来创建字符串对象
            String(char[] value, int offset, int count)  根据指定的字符数组范围内容,来创建字符串对象
            public   String(byte[] bys)根据字节数组的内容，来创建字符串对象
            public   String(byte[], int offset, int length)根据指定的字节数组范围的内容,来创建字符串对象
            String s =   “abc”;直接赋值的方式创建字符串对象，内容就是abc
         */

        //1.创建空白字符串对象
        String str1 = new String();//字符串内容 ""
        System.out.println("="+str1+"=");//==

        //2.根据字符数组的内容创建字符串对象 String(char[] chs)
        char[] chs = {'a','b','c','d','e'};
        String str2 = new String(chs);//
        System.out.println(str2);//"abcde"

        //3.根据指定的字符数组范围内容,来创建字符串对象
        String str3 = new String(chs,0,3);//内容 offset:索引 count:长度(偏移的个数)
        System.out.println(str3);//abc

        //4.根据字节数组的内容，来创建字符串对象
        byte[] bys = {65,66,67,68,69,70};
        String str4 = new String(bys);
        System.out.println(str4);//"ABCDEF"

        //5.根据指定的字节数组范围的内容,来创建字符串对象
        String str5 = new String(bys,1,3);//"BCD"
        System.out.println(str5);

        //6.直接赋值方式创建字符串对象
        String s = "abc";
        System.out.println(s);
    }
}
