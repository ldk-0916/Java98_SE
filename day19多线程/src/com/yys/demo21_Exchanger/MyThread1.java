package com.yys.demo21_Exchanger;

import java.util.concurrent.Exchanger;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/13:41
 */
public class MyThread1 extends Thread {
    Exchanger<String> ex;

    public MyThread1(Exchanger<String> ex) {
        this.ex = ex;
    }
    @Override
    public void run(){
        System.out.println("线程1:准备把数据传递给线程2");
        String msg = null;
        try {
            msg = ex.exchange("张三");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程1:接收来自线程2传递的数据:"+msg);
    }
}
