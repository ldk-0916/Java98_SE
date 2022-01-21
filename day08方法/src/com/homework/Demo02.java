package com.homework;

import java.util.Scanner;

/**
     在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。
     执行效果如下
     请输入第一个整数：10
     请输入第二个整数：30
     请输入第三个整数：20
     从大到小的顺序是： 30 20 10
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数: ");
        int x = sc.nextInt();
        System.out.println("请输入第二个整数: ");
        int y = sc.nextInt();
        System.out.println("请输入第三个整数");
        int z = sc.nextInt();
        method(x,y,z);
    }
    //a,b,c为形式参数
    public static void method(int a,int b,int c){
        //定义一个变量存储最大值(初始值给他为0)
        int max = 0;
        //定义一个变量存储最小值(初始值给他为0)
        int min = 0;
        //判断最大值
        if (a > b && a > c){
            max = a;
        }else if (b > a && b > c){
            max = b;
        }else {
            max = c;
        }
        //判断最小值
        if (a < b && a < c){
            min = a;
        }else if (b < a && b < c){
            min = b;
        }else{
            min = c;
        }
        int mid = a + b + c - max - min;
        //按照从大到小顺序依次打印
        System.out.println("从大到小顺序依次是" + max + " " + mid + " " + min);
    }
}
