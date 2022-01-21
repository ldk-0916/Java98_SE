package com.yys.demo16_CopyOnWriteArraySet;

import java.util.HashSet;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:49
 */
public class MyThread1 extends Thread {
    static HashSet<Integer> set = new HashSet<>();
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            set.add(i);
        }
    }
}
