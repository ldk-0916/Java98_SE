package com.yys.demo03_等待唤醒案例;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/9:33
 */
public class Test {
    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //启动包子铺(生产者)线程
        new BaoziPu(bz).start();
        //启动吃货线程(消费者)
        new Customer(bz).start();
    }
}
