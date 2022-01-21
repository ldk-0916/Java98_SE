package com.yys.demo17_ConcurrentHashMap;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:25
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        /*
            演示Hashtable线程安全的,添加键值对
         */
        new MyThread2().start();

            //添加键值对
            for (int i = 0; i < 20000; i++) {
                MyThread2.map.put(i,i);
            }

            Thread.sleep(3000);
        System.out.println("集合中键值对个数:"+MyThread2.map.size());
        /*
            期望值和实际值一直是相同:20000
         */
    }
}
