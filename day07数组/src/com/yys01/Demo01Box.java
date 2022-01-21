package com.yys01;

/**

 变量中只能存储一个数据,新的数据进来,老的数据将被替换,如果需要存储多个数据,需要使用容器。

 容器概念
 容器：是将多个数据存储到一起，每个数据称为该容器的元素。
 生活中的容器：水杯，衣柜，鞋柜，教室

 数组：
 1.概念： java中的数组就是一个容器，可以存储多个数据，但是数据的类型必须一致
 2.特点：
 (1)可以存储多个数据
 (2)多个数据的类型必须保持一致
 (3)数组一旦创建,长度是永远不可以发生改变
 */
public class Demo01Box {
    public static void main(String[] args) {
        int num = 10;
        num = 20;
        System.out.println(num);

        //十几个学生成绩统计计算平均分
        int a = 27;
        int b = 27;
        int c = 27;
        int d = 27;
        int sum = a + b + c + d;//总分
        int avg = sum/4;//平均
        System.out.println(avg);
    }
}
