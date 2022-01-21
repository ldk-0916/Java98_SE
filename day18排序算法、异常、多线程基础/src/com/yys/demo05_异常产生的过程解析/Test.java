package com.yys.demo05_异常产生的过程解析;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/01/9:39
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr.length);//5
        method(arr,5);// java.lang.ArrayIndexOutOfBoundsException: 5:索引越界异常
    }

    public static void method(int[] arr,int index){
        int nums = arr[index];
        System.out.println(nums);
    }
}
