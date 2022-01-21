package com.yys;
import java.util.Scanner;
/**
 需求：
 任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。
 */
public class Demo04JiOu {
    public static void main(String[] args){
        //创建Scanner对象.
        Scanner sc = new Scanner(System.in);
        //获取任意一个整数
        System.out.println("请输入任意一个整数:");
        int num = sc.nextInt();

        //判断是奇数还是偶数(if-else);第二种格式
        if (num % 2 == 0){
            System.out.println(num + "是一个偶数");
        }else {
            System.out.println(num+"是一个奇数");
        }
    }
}
