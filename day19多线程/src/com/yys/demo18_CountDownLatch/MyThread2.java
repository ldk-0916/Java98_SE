package com.yys.demo18_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:48
 */
public class MyThread2 extends Thread {
    CountDownLatch cd1;

    public MyThread2(CountDownLatch cd1) {
        this.cd1 = cd1;
    }
    @Override
    public void run(){
        //打印B
        System.out.println("打印B...");
        //调用countDown()方法进行计数器-1
        cd1.countDown();
    }
}
