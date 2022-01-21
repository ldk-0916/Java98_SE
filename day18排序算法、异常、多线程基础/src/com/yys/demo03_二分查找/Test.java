package com.yys.demo03_二分查找;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/26/15:43
 */
public class Test {
    public static void main(String[] args) {
        /*
            二分查找
         */
        int[] arr = {10,14,21,38,45,47,53,81,87,99};
        //要查找的元素
        System.out.println(binarySearch(arr,50));//-1
        System.out.println(binarySearch(arr,81));//7
    }
//num:要猜的那个数
    public static int binarySearch(int[] arr,int num){
        //1.定义一个变量,记录左边元素的索引,初始值为0
        int left = 0;
        //2.定义一个变量,记录右元素的索引,初始值为arr.length-1
        int right = arr.length - 1;
        //3.进行判断,循环查找 ; 条件:记录左边元素的索引 <= 记录右边元素的索引
        while (left <= right){
            //4.计算中间元素索引
            int mid = (left + right) / 2;
            //判断中间索引对应的元素和我们要查找的元素进行比对:
            if (arr[mid] == num){
                return mid;
            }else if (arr[mid] < num){
                //说明要查找的元素在右边,那么记录左边元素的索引 = 中间元素索引 + 1
                left = mid + 1;
            }else{
                //说明要查找的元素在左边,那么记录左边元素的索引 = 中间元素索引 - 1
                right = mid - 1;
            }
        }
        return -1;
    }
}
