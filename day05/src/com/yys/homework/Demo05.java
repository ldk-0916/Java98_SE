package com.yys.homework;

import java.util.WeakHashMap;

/**
 有一个容量为10L的空水桶。水桶的上面开始往里灌水，同时下面开始往出流水。第一分钟灌水的速度是1L/min，
 第二分钟灌水的速度是2L/min，第三分钟灌水的速度是3L/min，以此类推。而流水的速度固定是3L/min。
 那么几分钟之后，水桶里能保持灌满水的状态
 */
public class Demo05 {
    public static void main(String[] args) {
        //定义两个变量 时间 水桶中剩余水量
        int t = 0;//时间
        int w = 0;//水量
        //条件水桶水量小于10
        while (w < 10){
            //每次循环给分钟数加1
            t++;
            //计算水量,每分钟进多少水
           /* //b:第几分钟进多少水
            int b = (t > 3) ? (t - 3) : 0;
            w+=b;*/
           /*if (t-3>0){
               w += t-3;
           }*/
           w += t -3;
           if (w < 0){
               w = 0;
           }

        }
        System.out.println("注满水需要"+ t+"分钟");
    }
}
