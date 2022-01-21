package com.homework;

import java.util.Scanner;

/**
    已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。定义一个方法，
 完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
 */
public class Demo04 {
    public static void main(String[] args) {
        //定义一个静态初始化数组
        int[] arr = {19,28,37,46,50};
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数据: ");
        int num = sc.nextInt();
        getIndex(arr,num);
    }
    //传递的这两个参数 1.数组,2.我们需要查找的数据
    public static void getIndex(int[] arr,int number){
        //遍历数组,获取数组中所有元素
        for (int i = 0; i < arr.length;i++){
            //i代表数组索引
            if (arr[i] == number){
                //直接输出
                System.out.println("索引为:" + i);
                break;
            }
        }
    }
}
