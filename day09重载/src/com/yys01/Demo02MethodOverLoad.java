package com.yys01;

/**
     1.定义一个获取两个int数字之和的方法
     2.定义一个获取三个int数字之和的方法
     3.定义一个获取两个double数字之和的方法
     4.定义一个获取三个double数字之和的方法
     定义一个获取两个int数字之和的方法

 方法重载(overload)概念总结:方法名相同,参数列表不同(个数和类型)
 */
public class Demo02MethodOverLoad {
    public static void main(String[] args) {
        System.out.println(getSum(10,20));
        System.out.println(getSum(10.0,20.0,1.0));
    }
    public static int getSum(int a,int b){
        System.out.println("两个int之和");
        return a + b;
    }
    public static int getSum(int a,int b,int c){
        System.out.println("三个int之和");
        return a + b + c;
    }

    public static double getSum(double a,double b){
        System.out.println("两个int之和");
        return a + b;
    }
    public static double getSum(double a,double b,double c){
        System.out.println("三个double之和");
        return a + b + c;
    }

}
