package com.yys.demo17_Arrays类;

import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/15:02
 */
public class Test {
    public static void main(String[] args) {
        /*
            Arrays类:
                概述:java.util.Arrays类,该类包含用于操作数组的各种方法（如排序和搜索)该类包含了很多静态方法
                常用方法:
                    sort():按照数字顺序排列指定的数组
                    toString():返回指定数组的的内容的字符串表示形式
         */
        int[] arr = {1,2,333,44,678,23,45};
        System.out.println("排序之前的数组:"+ Arrays.toString(arr));
        //对数组进行升序排序
        Arrays.sort(arr);
        System.out.println("排序之后的数组:"+Arrays.toString(arr));
    }
}
