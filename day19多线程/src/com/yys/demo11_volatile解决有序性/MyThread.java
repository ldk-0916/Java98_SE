package com.yys.demo11_volatile解决有序性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/13:35
 */
public class MyThread extends Thread {
    int a = 0;
    volatile boolean  flag = false;

    @Override
    public void run(){
        show1();
        show2();
    }
    public void show1(){
        a = 1;
        flag = true;
    }
    public void show2(){
        int n = 0;
        if (flag == true){
            n = a + 1;
        }
        System.out.println(n);
    }

}
