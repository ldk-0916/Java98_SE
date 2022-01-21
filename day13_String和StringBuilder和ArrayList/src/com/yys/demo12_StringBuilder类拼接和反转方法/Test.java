package com.yys.demo12_StringBuilder类拼接和反转方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/13:39
 */
public class Test {
    public static void main(String[] args) {
        /*
            public StringBuilder append(任意类型) 拼接数据，并返回对象本身
            public StringBuilder insert(int offset, 任意类型) 在指定位置插入数据,并返回对象本身
            public StringBuilder reverse()  反转字符串,并返回对象本身
         */
        // 1.创建可变字符串对象
        StringBuilder sb1 = new StringBuilder("com.yys");

        //在sb1后面拼接一个字符串
        StringBuilder sb2 = sb1.append("-yyds");
        System.out.println(sb1);//com.yys-yyds
        System.out.println(sb2);//com.yys-yyds
        System.out.println(sb1 == sb2);// true:地址值是一样的,所以为true

        // 2.public StringBuilder insert(int offset, 任意类型) 在指定位置插入数据,并返回对象本身
        //将-java插入到sb1可变字符串中:com.yys-java-yyds
        sb1.insert(7,"-java");
        System.out.println(sb1);//com.yys-java-yyds

        System.out.println("-------------------------------------");
        //把sb1中的字符串内容进行反转
        StringBuilder sb3 = sb1.reverse();
        System.out.println(sb1);
        System.out.println(sb3);
        System.out.println(sb1 == sb3);
    }
}
