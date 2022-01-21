package com.yys.demo10_volatile解决可见性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/10:41
 */
public class Test {
    public static void main(String[] args) {
        /*
            volatile解决可见性:使用volatile关键字修饰共享变量
            解决可见性原因:
                当变量被volatile修饰时，会迫使线程每次使用此变量，都会去主内存获取，保证其可见性
         */
        MyThread mt = new MyThread();
        mt.start();
        while (true){
            if (MyThread.flag == true){
                System.out.println("结束死循环...");
                break;
            }
        }
    }
}
