package com.yys.demo21_Exchanger;

import java.util.concurrent.Exchanger;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/05/13:41
 */
public class MyThread2 extends Thread {
    Exchanger<String> ex;

    public MyThread2(Exchanger<String> ex) {
        this.ex = ex;
    }
    @Override
    public void run(){
        System.out.println("线程2:准备把数据传递给线程1");
        String msg = null;
        try {
            msg = ex.exchange("罗翔");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程2:接收来自线程1传递的数据:"+msg);
    }
}
