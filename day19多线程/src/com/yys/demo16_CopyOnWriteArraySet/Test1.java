package com.yys.demo16_CopyOnWriteArraySet;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:48
 */
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        //演示HashSet线程不安全的,...添加10000条数据
        new MyThread1().start();
        for (int i = 0; i < 10000; i++) {
            MyThread1.set.add(i);
        }
        Thread.sleep(5000);
        System.out.println("集合中的元素个数:"+MyThread1.set.size());
    }
    /*
        期望值:20000
        实际值:10164
     */
}
