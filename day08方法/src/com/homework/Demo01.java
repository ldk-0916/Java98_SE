package com.homework;

/**
 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法(main)中调用方法进行测试。
 */
public class Demo01 {
    public static void main(String[] args) {
        double min = getMin(3.14, 5.12);
        System.out.println("最小值:"+min);
    }
    public static double getMin(double a,double b){
        //判断大小
        double min = (a < b) ? a : b;
        return min;
    }
}
