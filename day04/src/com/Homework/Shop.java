package com.Homework;
import java.util.Scanner;
/**
 某商场购物可以打折，具体规则如下：

 ​1.普通顾客购不满100元不打折，满100元打9折；
 2.会员购物不满200元打8折，满200元打7.5折；
 3.不同打折规则不累加计算。

 请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），
 输出应付金额（小数类型）。

 */
public class Shop {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类别(0:普通客户, 1:会员客户):");
        int type = sc.nextInt();
        //购物金额
        System.out.println("请输入购物金额:");
       double money = sc.nextDouble();
       //进行(顾客类别)判断
       if (type == 0){
        //判断消费金额
           if (money > 0 && money < 100){
               System.out.println("您消费的金额为:" + money);
           }else if (money >= 100){
               System.out.println("您消费的金额为:" + money * 0.9);
           }else {
               System.out.println("您输入的金额有误");
           }
       }else if (type == 1){
           //判断消费金额
           if (money > 0 && money < 200){
               System.out.println("您消费的金额:" + money * 0.8);
           }else if (money >= 200){
               System.out.println("您消费的金额为:" + money * 0.75);
           }else{
               System.out.println("您输入的金额有误");
           }
       }else{
           System.out.println("您输入的顾客类别有误");
       }
    }
}
