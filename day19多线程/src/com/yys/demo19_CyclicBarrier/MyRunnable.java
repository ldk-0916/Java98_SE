package com.yys.demo19_CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/10:53
 */
public class MyRunnable implements Runnable {
    CyclicBarrier cb;

    public MyRunnable(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        //员工到达会议室开会
        System.out.println(Thread.currentThread().getName() + ":到达会议室");
        //告诉他,线程到达屏障了,当前线程阻塞
        try {
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //离开会议室
        System.out.println(Thread.currentThread().getName() + ":离开会议室");
    }
}
