package com.yys.demo17_ConcurrentHashMap;

import java.util.HashMap;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/9:16
 */
public class MyThread1 extends Thread {
    //共享变量
    static HashMap<Integer,Integer> map = new HashMap<>();

    @Override
    public void run(){
        //添加键值对到集合中(子线程)
        for (int i = 0; i < 20000; i++) {
            map.put(i,i);
        }
    }
}
