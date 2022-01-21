package com.yys04;

/**
 需求:
 求int数组元素最大值
 */
public class Demo02MaxArray {
    public static void main(String[] args) {
        //定义一个数组,初始化
        int[] arr = {10,200,15,30,100,32};
        //求这个数组最大值;假设索引为0的元素为这个数组的最大值
        int max = arr[0];
        //使用for循环获取每一个元素
        for (int i = 1; i < arr.length; i++){
            //判断如果下一个元素大于max,就把值赋值给max;
            if (arr[i] > max){
                //就把当前元素的值赋值给max
                max = arr[i];
            }
        }
        System.out.println("元素最大值为:"+ max);
    }
}
