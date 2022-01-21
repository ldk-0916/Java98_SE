package com.yys.demo08字符串拼接案例;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/9:33
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求:
                定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法
              并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
         */
        int[] arr = {1,2,3,4,5};
    }
    public static void arrMethod(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.println("["+arr[i]+",");
            }else if (i == arr.length-1){
                System.out.println(arr[i] + "]");
            }else{
                System.out.println(arr[i]+",");
            }
        }
    }
}
