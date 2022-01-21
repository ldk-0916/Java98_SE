package com.yys.demo08字符串拼接案例;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/9:45
 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arrMethod(arr));
    }
    public static String arrMethod(int[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                str += "[" + arr[i] + ",";
            }else if (i == arr.length-1){
                str += arr[i] + "]";
            }else{
                str += arr[i] + ",";
            }
        }
        return str;
    }
}
