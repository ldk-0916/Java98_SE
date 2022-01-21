package com.yys.demo08_多线程的安全性问题_有序性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/9:55
 */
public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.show1();
        mt.show2();
    }
}
