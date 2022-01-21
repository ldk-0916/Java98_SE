package com.yys;
import java.util.Scanner;
/**
 需求：
 一年有12个月，分属于春夏秋冬4个季节，
 键盘录入一个月份，请用程序实现判断该月份属于哪个季节，并输出。

 演示效果
 输入： 1、2、12 输出：冬季
 输入： 3、4、5 输出：春季
 输入： 6、7、8 输出：夏季
 输入： 9、10、11 输出：秋季
 输入： 其它数字 输出：数字有误
 */
public class Demo02SwitchMonth {
    public static void main(String[] args){
        //创建键盘录入类Scanner对象
        Scanner sc  = new Scanner(System.in);
        //1.创建月数的条件
        int month = sc.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
            default:
                System.out.println("你输入的月份有误,请重新来..");
        }
    }
}
