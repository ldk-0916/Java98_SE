package com.yys.demo17_ConcurrentHashMap;

import java.util.Hashtable;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:26
 */
public class MyThread2 extends Thread {
    static Hashtable<Integer,Integer> map = new Hashtable<>();
    @Override
    public void run(){
        //添加键值对
        for (int i = 0; i < 20000; i++) {
            map.put(i,i);
        }
    }
}
