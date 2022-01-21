package com.yys.demo12_volatile不能解决原子性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/10:28
 */
public class MyThread extends Thread {
    //共享变量
    volatile static int a = 0;

    @Override
    public void run(){
        for (int i = 0; i < 100000; i++) {
            a++;
        }
        System.out.println("子线程执行完毕...");
    }
}
