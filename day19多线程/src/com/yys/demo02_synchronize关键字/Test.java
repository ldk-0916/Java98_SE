package com.yys.demo02_synchronize关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/11:13
 * 买票问题
 */
public class Test {
    public static void main(String[] args) {
        /*
        同步代码块:
            synchronized关键字可以用于方法中的某个区块中,表示只对这个区块资源进行互相排斥访问
            格式:synchronized(锁对象){

            }
            锁对象:
                1.语法上可以是任意类型的对象;
                2.多条线程如果要实现同步,必须同一个锁对象(锁对象要一致)

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
