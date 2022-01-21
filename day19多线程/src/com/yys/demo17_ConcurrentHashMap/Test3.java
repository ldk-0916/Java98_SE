package com.yys.demo17_ConcurrentHashMap;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:34
 */
public class Test3 {
    public static void main(String[] args) {
        /*
            ConcurrentHashMap线程安全的
         */
        new MyThread3().start();
        for (int i = 0; i < 20000; i++) {
            MyThread3.map.put(i,i);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("集合中键值对个数:"+MyThread3.map.size());
        /*
        实际值和期望值都是一样的:20000
         */
    }
}
