package com.yys.demo17static开发中的应用;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/16:25
 */
public class Utils {//工具类
    //π的值
    public static final double PI = 3.14;
    //宽
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    //找int数组中最大的值
    public static int getArrayMax(int[] arr){
        //假设下标为0的那个元素为数组中最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
