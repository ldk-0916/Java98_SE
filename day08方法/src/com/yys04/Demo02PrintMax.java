package com.yys04;

/**
 设计一个方法可以获取两个int数的较大值，数据来自于参数
 */
public class Demo02PrintMax {
    public static void main(String[] args) {
         printMax(11,111);
    }
    //第一种方法
 /*   public static int printMax(int a, int b){
        int result = (a > b) ? a : b;
        return result;
    }*/
    //第二种方法
    public static void printMax(int a, int b){
        int result = (a > b) ? a : b;
        System.out.println("最大值:"+result);
    }
}
