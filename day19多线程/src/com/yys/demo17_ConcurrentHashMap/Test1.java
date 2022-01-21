package com.yys.demo17_ConcurrentHashMap;


/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:14
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            演示HashMap线程不安全:2条线程往集合中添加键值对
         */
        /*MyThread1 mt = new MyThread1();
        mt.start();*/
        new MyThread1().start();
        //添加数据
        for (int i = 0; i < 20000; i++) {
            MyThread1.map.put(i,i);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("键值对个数:"+MyThread1.map.size());
    }
    /*
        期望值:20000
        实际值:22673
        大于20000
     */
}
