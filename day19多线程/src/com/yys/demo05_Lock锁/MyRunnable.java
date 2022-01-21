package com.yys.demo05_Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/15:51
 */
public class MyRunnable implements Runnable {
    //共享变量
    int tickets = 100;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        //线程任务代码
        while (true){
            //加锁
            lock.lock();
            if (tickets < 1){
                lock.unlock();
                break;
            }
            //收钱
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":正在出售第" + tickets + "张票");
            tickets--;
            //释放锁
            lock.unlock();
        }
    }
}
