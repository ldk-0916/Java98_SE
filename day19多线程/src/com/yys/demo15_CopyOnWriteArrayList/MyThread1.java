package com.yys.demo15_CopyOnWriteArrayList;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/15:24
 */
public class MyThread1 extends Thread {
    //共享变量
    static ArrayList<Integer> list = new ArrayList<>();
    @Override
    public void run(){
        //往集合中添加数据
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }
}
