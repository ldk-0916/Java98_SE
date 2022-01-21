package com.homework;

import java.util.Scanner;

/**
 在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。
 执行效果如
 */
public class MaoPao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int c = sc.nextInt();
        method(a,b,c);
    }
    public static void method(int a,int b,int c) {
        int[] array = {a,b,c};
        for (int i = 0; i <array.length ; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }
        System.out.println("从大到小排序"+array[0]+" "+array[1]+" "+array[2]);
    }
}
