package com.yys.demo16_CopyOnWriteArraySet;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:49
 */
public class MyThread2 extends Thread {
    static CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet();
    @Override
    public void run(){
        for (int i = 10000; i < 20000; i++) {
            set.add(i);
        }
    }
}
