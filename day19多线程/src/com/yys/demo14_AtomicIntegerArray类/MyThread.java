package com.yys.demo14_AtomicIntegerArray类;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:07
 */
public class MyThread extends Thread {
    //共享数组
    //static int[] arr = new int[1000];
    static AtomicIntegerArray arr = new AtomicIntegerArray(1000);
    @Override
    public void run(){
        //对数组进行自增
        for (int i = 0; i < arr.length(); i++) {
            //arr[i]++;
            arr.getAndAdd(i,1);
        }
    }
}
