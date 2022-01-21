package com.yys.demo20_方法引用;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/9:51
 */
public class Test {
    public static void main(String[] args) {
        /*
            方法的引用:
                概述:方法引用使用一对冒号 :: , 方法引用就是用来在一定的情况下,替换Lambda表达式
            使用场景:
                1.如果一个Lambda表达式大括号中的代码和另一个方法的代码一模一样,那么就可以使用方法引用把他引用过来.替换Lambda表达式
                2.如果一个Lambda表达式大括号中的代码就是调用另一方法,那么就可以使用方法引用把该方法引过来,从而替换Lambda表达式
         */
        //创建一个线程
        new Thread(() ->{
            System.out.println("线程执行了...");
        }).start();

        //这个线程和Test类中show方法的方法体内容一样就可以替换了
        new Thread(Test::show).start();
        System.out.println("------------------------------------------------");
        new Thread(() ->{
            Test.show();
        }).start();
    }
    public static void show(){
        System.out.println("线程执行了...");
    }
}
