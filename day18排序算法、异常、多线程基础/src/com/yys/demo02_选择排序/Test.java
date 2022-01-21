package com.yys.demo02_选择排序;

import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/26/14:38
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {44,25,35,38,13};
        System.out.println("排序前:"+ Arrays.toString(arr));

        //选择排序
        //外循环控制轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环控制比较次数
            for (int j = i + 1; j < arr.length; j++) {
                //比较判断
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
