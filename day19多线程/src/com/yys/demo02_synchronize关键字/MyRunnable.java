package com.yys.demo02_synchronize关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/11:18
 */
public class MyRunnable implements Runnable {
    //创建一个共享变量
    int tickets = 100;
    @Override
    public void run() {
        //四个窗口的任务都是--卖票
        while (true){
            synchronized (this){
                if (tickets < 1){
                    break;
                }
                //收钱(模拟收钱)
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":正在出售第" + tickets + "张票");
                tickets --;
            }

        }
    }
}
