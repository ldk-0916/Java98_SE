package com.yys03;

/**需求:
 设计一个方法用于获取int数组中元素的最大值
 举例:
 原数组: {11,22,33,44,55}
 最大值: 55
 */
public class Demo0PrintArrayMax {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
            //假设索引为0那个元素为最大值
            int max = arr[0];
            //循环判断
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
