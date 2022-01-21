package com.yys.demo09_多线程的安全性问题_原子性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/10:28
 */
public class MyThread extends Thread {
    //共享变量
    static int a = 0;

    @Override
    public void run(){
        for (int i = 0; i < 100000; i++) {
            a++;
        }
        System.out.println("子线程执行完毕...");
    }
}
