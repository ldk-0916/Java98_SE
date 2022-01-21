package com.yys;

import java.util.Scanner;

/**
 数据输出: 把程序运行的结果数据输出到控制台,从而显示到屏幕上
 数据输入: 获取用户从键盘上录入的数据到程序当中,然后程序根据业务需求,对获取到的数据进行相关处理

 思考1:
 像数据输入这样的操作使用非常频繁,而且实现起来比较复杂,jdk的开发人员已经把此功能实现好了
 jdk中把获取键盘录入数据的功能放到了java.util包的Scanner类中

 思考2: 如何使用键盘录入Scanner类呢?
 java中的数据类型: 基本数据类型(四类八种)和引用数据类型(类,接口,数组,枚举...)
 对于引用类型的使用有固定的使用步骤,而键盘录入Scanner类就是一个引用类型,使用也有固定的步骤

 键盘录入Scanner的使用,有固定的3个步骤:                    ----固定格式,先记住
 1.导包(找到我们要使用的东西,告诉jvm我们使用的东西在哪里)
 格式:
 import 包名.类名;
 import java.util.Scanner;

 2.创建对象:
 格式:
 类名 对象名 = new 类名(...);
 类名: 就是之前写代码时class关键字后面的名字
 Scanner sc = new Scanner(System.in);
 注意: System.in是固定写法,后面就业班专门讲解

 3.使用:
 sc.nextInt(): 获取键盘录入的整数数字
 4.练习:
 获取键盘录入的一个int数字并输出到控制台
 (1)导包: import java.util.Scanner;
 (2)创建对象: Scanner sc = new Scanner(System.in);
 (3)获取键盘录入的数字: sc.nextInt()
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        /*
            1.导包:import java util.Scanner
            2.创建对象 Scanner sc = new Scanner(System.in);
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int num = sc.nextInt();
        System.out.println("你输入的数字是:"+num);
    }
}
