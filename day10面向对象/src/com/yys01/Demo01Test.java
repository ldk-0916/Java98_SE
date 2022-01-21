package com.yys01;

import java.util.Arrays;

/**
 * 需求:打印数组中所有的元素,打印格式为: [元素1，元素2，元素3，元素，...，元素n]
 *
 * 面向过程:强调的是过程,是一步一步怎么来实现的
 * 面向对象:只需要对象来调用他的行为(方法)来实现功能
 */
public class Demo01Test {
    public static void main(String[] args) {
        //定义数组并初始化
        int[] arr = {10,20,30,40,50};
        //面向过程的思想
        System.out.print("[");
        //数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("------------------------------");
        //面向对象的思想
        System.out.println(Arrays.toString(arr));
    }

}
