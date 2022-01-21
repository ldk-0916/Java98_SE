package com.yys.demo22_线程池;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/14:04
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":开始执行任务...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":任务执行完毕...");
    }
}
