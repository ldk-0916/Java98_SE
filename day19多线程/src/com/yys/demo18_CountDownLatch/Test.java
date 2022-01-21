package com.yys.demo18_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            CountDownLatch:允许一个或者多个线程等待其他线程完成操作
                CountDownLatch的方法:
                    构造方法:CountDownLatch(int count)初始化一个指定计数器CountDownLatch对象
                    await():让当前线程等待(当计数器的值为0时,那么等待结束)
                    countDown:让计数器进行减一

               例如：线程1要执行打印：A和C，线程2要执行打印：B，但线程1在打印A后，要线程2打印B之后才能打印C，
                  所以：线程1在打印A后，必须等待线程2打印完B之后才能继续执行。
                分析:
                线程1:
                    任务:
                        打印A
                        调用await()方法进入等待

                线程2:
                    任务:
                    打印B
                    调用countDown()方法让计数器-1

                 注意:
                    1.创建CountDownLatch对象的计数器初始值为1
                    2.线程1和线程2使用的CountDownLatch对象要一致

         */

        //创建CountDownLatch对象,指定计数器的值为1
        CountDownLatch cd1 = new CountDownLatch(1);
        //创建并启动线程
        new MyThread1(cd1).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new MyThread2(cd1).start();
    }
}
