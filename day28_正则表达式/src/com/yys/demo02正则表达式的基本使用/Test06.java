package com.yys.demo02正则表达式的基本使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/25/11:26
 */
public class Test06 {
    public static void main(String[] args) {
        /*
            String中正则使用
            split()
         */
        String str = "123 4 567   23 7  89";
        String[] arr = str.split(" +");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("------------------------------");
        String str1 = "rjhajodsfhkasjkdghfjak1234";
        System.out.println(str1.replaceAll("\\d+","*"));
    }
}
