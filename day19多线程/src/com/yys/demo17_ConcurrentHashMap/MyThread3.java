package com.yys.demo17_ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:26
 */
public class MyThread3 extends Thread {
    static ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
    @Override
    public void run(){
        //添加键值对
        for (int i = 0; i < 20000; i++) {
            map.put(i,i);
        }
    }
}
