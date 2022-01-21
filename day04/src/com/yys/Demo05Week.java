package com.yys;
import java.util.Scanner;
/**
 需求:
 键盘录入一个星期数(1,2,...7)，输出对应的星期一，星期二，...星期日

 演示效果:
 输入 1 输出 星期一
 输入 2 输出 星期二
 输入 3 输出 星期三
 输入 4 输出 星期四
 输入 5 输出 星期五
 输入 6 输出 星期六
 输入 7 输出 星期日
 输入 其它数字 输出 数字有误
 */
public class Demo05Week {
    public static void main(String[] args){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //获取键盘录入整数,代表星期数
        System.out.println("请输入1-7代表星期数:");
        int week = sc.nextInt();
        if (week == 1){
            System.out.println("星期一");
        }else if (week == 2){
            System.out.println("星期二");
        }else if (week == 3){
            System.out.println("星期三");
        }else if (week == 4){
            System.out.println("星期四");
        }else if (week == 5){
            System.out.println("星期五");
        }else if (week == 6){
            System.out.println("星期六");
        }else if (week == 7){
            System.out.println("星期日");
        }else {
            System.out.println("你输入的有误...");
        }
    }
}
