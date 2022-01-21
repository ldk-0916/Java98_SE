package com.yys;
import java.util.Scanner;
/**
 需求：
 获取键盘录入的两个整数(int类型)数字,在控制台输出求和的结果。

 */
public class Demo02Scanner {
    public static void main(String[] args){
        //2.创建Scanner对象(固定写法)
        Scanner sc = new Scanner(System.in);
        //3.获取键盘录入的两个整数
        System.out.println("请输入第一个数字:");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个数字:");
        int num2 = sc.nextInt();

        //求和
        int sum = num1 + num2;
        System.out.println("最终求和结果为:"+sum);

    }
}
