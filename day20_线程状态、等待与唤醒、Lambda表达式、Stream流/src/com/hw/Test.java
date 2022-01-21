package com.hw;



/**
 * @Author: 夜遊神
 * @Date: 2021/11/09/9:06
 *
 *   请用“等待唤醒”机制编写一个程序，要求：
 *                 第一个线程：遍历1--1000所有的数字，在遍历过程中，如果发现这个数字能同时被
 *                                 2,3,5,7整除，立即wait()退出等待，让第二个线程进入。
 *                 第二个线程：运行后，将一个计数器 + 1，之后再唤醒等待的线程。
 *                 主线程中：休息2秒，让两个线程全部执行完毕，打印“计数器”的结果。
 *                 注意：第二个线程使用的计数器，要定义在线程外部。
 */

public class Test {
    static boolean flag = false;//进入无限等待;true为执行计数操作
    static Object lock = new Object();//锁对象
    static int count;//计数器
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    synchronized (lock){
                        if (flag == true){
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                            System.out.println(i);
                            flag = true;
                            lock.notify();//唤醒线程
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //被唤醒一次就加1
                while (true){
                    synchronized (lock){
                        if (flag == false){
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (flag == true){
                            count++;//计数+1
                            flag = false;
                            lock.notify();
                        }
                    }
                }
            }
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
        System.exit(0);
    }
}
