package com.yys.demo15_CopyOnWriteArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:36
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            CopyOnWriteArrayList线程安全的
         */
        new MyThread2().start();
        for (int i = 0; i < 100000; i++) {
            MyThread2.list.add(i);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("list集合元素:"+MyThread2.list.size());
    }
}
