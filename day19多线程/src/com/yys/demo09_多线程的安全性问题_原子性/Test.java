package com.yys.demo09_多线程的安全性问题_原子性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/10:25
 */
public class Test {
    public static void main(String[] args) {
        /*
            多线程的安全问题-原子性
                概述:所谓的原子性是指在一次操作或者多次操作中，要么所有的操作全部都得到了执行并且不会受到任何因素的干扰而中断，
                  要么所有的操作都不执行，多个操作是一个不可以分割的整体。

                演示:一条子线程和一条主线程都对共享变量进行++操作,每条线程对++操作100000次
         */
        //创建线程对象
        MyThread mt = new MyThread();
        //启动线程
        mt.start();
        //主线程对共享变量a也进行自增10万次
        for (int i = 0; i < 100000; i++) {
            MyThread.a++;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //打印最终共享变量a的值
        System.out.println("最终:"+MyThread.a);//最终:103642
    }
    /*
        期望值:200000
        实际值:103642
        原因:两个线程对共享变量的操作产生覆盖的效果
     */

}
