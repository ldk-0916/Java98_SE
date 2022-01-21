package com.yys.demo17_线程的Api;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/13:38
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":线程开始执行....");
        System.out.println(Thread.currentThread().getName()+":线程结束执行....");
    }
}
