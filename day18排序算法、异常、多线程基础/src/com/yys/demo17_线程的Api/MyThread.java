package com.yys.demo17_线程的Api;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/13:39
 */
public class MyThread extends Thread {
    /*
        getName()获取线程名称
        sleep()使当前正在执行的线程以指定的毫秒数暂停
     */

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println(getName() + "子线程 开始执行任务代码...");
        //暂停3秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "子线程 结束执行任务代码...");
    }
}
