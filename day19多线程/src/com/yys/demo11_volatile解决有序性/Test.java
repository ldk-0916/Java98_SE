package com.yys.demo11_volatile解决有序性;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/04/13:37
 */
public class Test {
    static int a = 0;
    static  boolean flag = false;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            a = 0;
             flag = false;

            new Thread(() -> {
                a = 1;
                flag = true;
            }).start();

            new Thread(() ->{
                int n = 0;
                n = a + 1;
                System.out.println(n);
            }).start();
        }
      MyThread mt = new MyThread();
      mt.start();
    }
}
