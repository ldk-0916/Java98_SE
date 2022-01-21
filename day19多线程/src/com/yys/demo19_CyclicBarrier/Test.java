package com.yys.demo19_CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/10:50
 */
public class Test {
    public static void main(String[] args) {
        /*
             公司召集5名员工开会，等5名员工都到了，会议开始。
             我们创建5个员工线程，1个开会线程，几乎同时启动，使用CyclicBarrier保证5名员工线程全部执行后，再执行开会线程。
            CyclicBarrier:可循环使用的屏障
                它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，直到最后一个线程到达屏障时，屏障才会开门，
                所有被屏障拦截的线程才会继续运行。
            成员方法:
             CyclicBarrier(int parties, Runnable barrierAction)
             parties:到达屏障的线程数量
             barrierActions:到达屏障后要执行的线程任务
         */
        CyclicBarrier cb = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("人员到齐了,可以卡会...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("会议结束,晚上聚餐...");
            }
        });

        //创建任务
        MyRunnable mr = new MyRunnable(cb);
        //创建5条线程
        new Thread(mr,"员工1").start();
        new Thread(mr,"员工2").start();
        new Thread(mr,"员工3").start();
        new Thread(mr,"员工4").start();
        new Thread(mr,"员工5").start();
    }
}
