package com.yys02;

/**
 定义一个方法，打印该方法内部的两个数据(方法内部定义的变量)的最大值
 */
public class Demo02Max {
    public static void main(String[] args) {
        max();
    }
    public static void max(){
        int num1 = 12310;
        int num2 = 12580;
        if (num1 > num2){
            System.out.println("num1:"+num1);
        }else{
            System.out.println("num2:"+num2);
        }
        return;//void返回值 建议省略
    }
}
