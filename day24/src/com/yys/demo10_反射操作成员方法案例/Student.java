package com.yys.demo10_反射操作成员方法案例;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/17/13:37
 */
public class Student {
    public void show1(){
        System.out.println("show1方法....");
    }

    public void show2(int num){
        System.out.println("show2方法...");
    }

    private void show3(){
        System.out.println("show3方法...");
    }
    private void show4(String str){
        System.out.println("show4方法...");
    }
    public int show5(int num){
        System.out.println("show5方法...");
        return 1;
    }
}
