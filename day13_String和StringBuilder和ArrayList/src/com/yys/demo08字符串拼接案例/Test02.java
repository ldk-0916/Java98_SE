package com.yys.demo08字符串拼接案例;

import java.lang.reflect.Method;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/9:45
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arrMethod(arr));
    }
    public static String arrMethod(int[] arr){
        String str = "";
        str +="["; //str = str + "["  --->[
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                str += arr[i];//拼接的最后一个元素
            }else{
                str += arr[i];
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
