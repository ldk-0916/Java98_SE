package com.yys02;

import java.util.Scanner;

/**
 定义一个方法，打印输出该方法内部的数据(方法内部定义的变量)是否是偶数
 */
public class Demo01Print {
    public static void main(String[] args) {
        System.out.println("程序开始.........");
        //调用方法
        ou();
        System.out.println("程序结束.........");
    }
    public static void ou(){
        //int num = 10;
        //if (num %2 == 0){
        //    System.out.println("num是偶数");
        //}else{
        //    System.out.println("num不是偶数");
        //}
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println("num是偶数");
        }else {
            System.out.println("num不是偶数");
        }
    }
}
