package com.yys.demo15_CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:34
 */
public class MyThread2 extends Thread {
    static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public void run(){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
    }
}
