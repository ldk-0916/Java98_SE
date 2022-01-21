package com.yys.demo01_产生死锁的条件;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/15:16
 */
public class Test {
    public static void main(String[] args) {
        /*
            产生死锁的条件:
                1.有多把锁
                2.多个线程
                3.同步代码块嵌套
         */
        //创建三把锁1,2,3
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("锁A"){
                    System.out.println("线程1:拿到了锁1,准备拿锁2");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized ("锁B"){
                        System.out.println("线程1:拿到了锁1和锁2开始执行....");
                    }

                }
            }
        },"线程1").start();


        //线程2
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized ("锁B"){
                    System.out.println("线程2:拿到了锁1,准备拿锁2");
                    synchronized ("锁A"){
                        System.out.println("线程2:拿到了锁1和锁2开始执行....");
                    }
                }
            }
        },"线程2").start();

        System.out.println("执行完毕...");
    }
}
