package com.yys.demo03_同步方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/15:10
 */
public class MyRunnable implements Runnable {
    int tickets = 100;
    @Override
    public void run() {
        //同步方法 卖票
        while (true){
            if (sellTickets()) break;//票卖完了,跳出死循环
        }
    }

    private synchronized boolean sellTickets(){
        if (tickets <= 0){
            return true;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ":正在出售第" + tickets + "张票");
        tickets--;
        return false;
    }
}
