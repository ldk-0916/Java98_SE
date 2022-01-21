package com.yys.demo18_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:48
 */
public class MyThread1 extends Thread {
    CountDownLatch cd1;

    public MyThread1(CountDownLatch cd1) {
        this.cd1 = cd1;
    }

    @Override
    public void run(){
        //打印A
        System.out.println("打印A.....");

        //进行等待(线程2执行打印B)
        try {
            cd1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C出来了....");
    }
}
