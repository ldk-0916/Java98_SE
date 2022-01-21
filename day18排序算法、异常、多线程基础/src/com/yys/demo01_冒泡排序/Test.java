package com.yys.demo01_冒泡排序;

import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/26/14:07
 */
public class Test {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {7,6,15,5,4,3};
        System.out.println("排序前:"+ Arrays.toString(arr));
        //冒泡排序
        //外循环控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环控制比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //比较判断
                if (arr[j] > arr[j+1]){
                    //交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后:"+Arrays.toString(arr));
    }
}
