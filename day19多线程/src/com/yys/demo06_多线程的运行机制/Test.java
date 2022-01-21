package com.yys.demo06_多线程的运行机制;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/9:08
 */
public class Test {
    public static void main(String[] args) {
        /*
            多线程的运行机制:
                1.当一个线程启动过后,JVM会为其分配一个独立的线程栈区,这个线程会在这个栈区中运行
                2.线程的调度是抢占式的
         */
        //创建线程对象
        MyThread mt = new MyThread();

        //启动线程
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("李四 第:" + i + "次循环");
        }
    }
}
