package com.yys.demo17_线程的Api;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/13:37
 */
public class Test {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();//无参构造创建线程对象 名称:默认名称 Thread-0
        mt1.start();

        MyThread mt2 = new MyThread("线程1");
        mt2.start();

        //名称 main
        System.out.println(Thread.currentThread().getName() + ":线程开始执行了");
        System.out.println(Thread.currentThread().getName() + ":线程结束执行了");
    }
}
