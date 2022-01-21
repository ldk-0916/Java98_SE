package com.yys.demo14_AtomicIntegerArray类;

import java.util.Arrays;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:05
 */
public class Test {
    public static void main(String[] args) {
        /*
            AtomicIntegerArray类:表示int[]数组,操作该数组就是原子操作
            演示:3000条线程都对一个长度1000的数组中的所有元素全部自增
         */

        for (int i = 0; i < 3000; i++) {
            MyThread mt = new MyThread();
            mt.start();
        }
        //为了保证执行完毕,让他休眠
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(MyThread.arr);
    }
}
