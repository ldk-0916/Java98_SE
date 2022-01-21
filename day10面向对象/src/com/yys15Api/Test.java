package com.yys15Api;

import sun.management.Agent;

import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/09/30/11:21
 */
public class Test {
    public static void main(String[] args) {

         /*
                4.查看类的成员方法
                     byte nextByte()
                     short nextShort()
                     short nextInt()
                     Long nextLong()
                    boolean nextBoolean()
                     double nextDouble()
                    float nextFloat()

                     String nextLine()  可以获取一行字符串   空格,回车,tab键都可以获取
                     String next()      可以获取单个字符串   空格,回车,tab键都不可以获取

         */
        Scanner sc = new Scanner(System.in);//构造方法来创建的
        /*System.out.println("请输入一个数:");
        int num1 = sc.nextInt();*/
        System.out.println("请输入一行字符串:");
        String s = sc.nextLine();
        System.out.println(s);

        /*System.out.println("请输入年龄:");
        String age = sc.next();
        System.out.println(age);*/
     /*   System.out.println("请输入一个姓名:");
        String name = sc.next();
        System.out.println(name);*/

    }
}
