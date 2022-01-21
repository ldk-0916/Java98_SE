package com.yys.demo01_线程安全问题;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/11:13
 * 买票问题
 */
public class Test {
    public static void main(String[] args) {
        /*
            需求:模拟电影院卖100张票
                分析:
                    4个售票窗口卖票,用线程来模拟实现
                    4个窗口共同卖100张票,任务是一样的
                问题:
                    1.重复票
                    2.漏票
                    3.负数
         */
        //创建对象(卖票)
        MyRunnable mr = new MyRunnable();

        //创建线程(模拟四个卖票窗口)
        Thread t1 = new Thread(mr,"窗口1");
        Thread t2 = new Thread(mr,"窗口2");
        Thread t3 = new Thread(mr,"窗口3");
        Thread t4 = new Thread(mr,"窗口4");

        //启动线程,开始卖票
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
