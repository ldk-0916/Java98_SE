package com.yys.demo15_CopyOnWriteArrayList;


/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:23
 */
public class Test1 {
    public static void main(String[] args) {
        //演示ArrayList线程不安全的:2条线程里都往ArrayList里面添加100000条元素
        /*
            可能会出现下标越界异常
            实际值和期望值不符
         */
        //创建并启动线程
        new MyThread1().start();
        //添加数据
        for (int i = 0; i < 10000; i++) {
            MyThread1.list.add(i);
        }

        //休息一下,马上就好
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("list集合中的元素个数:"+MyThread1.list.size());
    }
}
