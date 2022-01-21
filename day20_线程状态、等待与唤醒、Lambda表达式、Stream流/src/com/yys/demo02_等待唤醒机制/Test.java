package com.yys.demo02_等待唤醒机制;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/15:52
 */
public class Test {
    //创建锁对象
    static Object lock = new Object();
    public static void main(String[] args) {
        //无限等待线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (lock){
                        System.out.println("无限等待:进入无限等待状态...");
                        try {
                            lock.wait();//线程进入阻塞
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("无限等待:解除无限等待状态....");
                    }
                }
            }
        }).start();

        //唤醒线程
        new Thread(new Runnable() {
            @Override
            public void run() {
               while (true){
                   synchronized (lock){
                       System.out.println("唤醒线程:准备唤醒无限等待的线程...");
                       lock.notify();
                       System.out.println("唤醒等待:唤醒完毕....");
                   }
               }
            }
        }).start();
    }
}
