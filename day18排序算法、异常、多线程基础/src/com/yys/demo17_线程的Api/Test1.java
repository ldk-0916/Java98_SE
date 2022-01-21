package com.yys.demo17_线程的Api;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/13:51
 */
public class Test1 {
    public static void main(String[] args) {
        //创建实现类对象
        MyRunnable mr = new MyRunnable();

        //创建线程对象
        Thread t1 = new Thread(mr);
        t1.start();

        Thread t2 = new Thread(mr,"A线程");
        System.out.println("-------------------------------------");

        new Thread(mr,"线程1").start();
        new Thread(mr,"线程2").start();
        new Thread(mr,"线程3").start();
        new Thread(mr,"线程4").start();
    }
}
