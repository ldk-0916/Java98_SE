package com.yys.demo03_等待唤醒案例;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/9:15
 */
//包子铺线程生产包子
public class BaoziPu extends Thread {
    //生产包子(生产者)
    BaoZi bz;

    public BaoziPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run(){
        //生产包子
        while (true){

            synchronized (bz){
                //判断是否有包子
                //01.如果有包子,让线程进入无限等待
                if (bz.flag == true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //02.如果没有包子,就生产包子,生产完包子,唤醒吃货(消费者)来吃包子
                if (bz.flag == false){
                    System.out.println("生产者线程:开始制作包子...");
                    bz.xianer = "香菇青菜";
                    bz.flag = true;
                    System.out.println("包子做好了,可以来吃了...");
                    bz.notify();
                }
            }
        }
    }
}
