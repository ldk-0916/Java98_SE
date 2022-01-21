package com.yys.demo08_多线程的安全性问题_有序性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/9:53
 */
public class MyThread extends Thread {
    int a = 10;
    boolean b = false;

    public void show1(){
        a = 1;
        b = true;
    }

    public void show2(){
        int n = 0;
        if (b == true){
            n = n + 2;
        }
        System.out.println("n的结果:" + n);
    }
}
