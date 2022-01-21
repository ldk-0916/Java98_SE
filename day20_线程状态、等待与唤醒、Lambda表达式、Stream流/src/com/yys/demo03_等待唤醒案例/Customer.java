package com.yys.demo03_等待唤醒案例;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/9:21
 */
//消费者线程
public class Customer extends Thread {
    BaoZi bz;

    public Customer(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run(){
        //吃包子
        while (true){
            //加锁
            synchronized (bz){
                //判断是否有包子
                if (bz.flag == false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如果有包子就吃
                if (bz.flag == true){
                    System.out.println("消费者线程:开始吃包子,包子馅是:"+bz.xianer);
                    bz.flag = false;
                    System.out.println("消费者线程:吃完包子,包子铺线程可以生产包子了");
                    bz.notify();
                }
            }
        }
    }
}
