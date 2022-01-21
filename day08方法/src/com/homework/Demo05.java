package com.homework;

import java.util.Scanner;

/**
 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)
 */
public class Demo05 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委打分");
             arr[i] = sc.nextInt();
        }
        //调用最高分
        int max = getMax(arr);
        //调用最低分
        int min = getMin(arr);
        //调用求和
        int sum = getSum(arr);
        //计算平均分
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.println("最终得分为:" + avg);
    }
    //最高分
    public static int getMax(int[] arr){
        //假设第一个评委为最高分
        int max = arr[0];
        for (int i = 1;i < arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //最低分
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    //求和
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
