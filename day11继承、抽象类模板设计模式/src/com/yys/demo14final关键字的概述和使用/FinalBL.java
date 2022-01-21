package com.yys.demo14final关键字的概述和使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/13:50
 */
public class FinalBL {
    //成员变量
    final int NUM = 10;
}
class FinalBL2{
    //成员变量
    final int NUM;
    public FinalBL2(){
        this.NUM = 10;
    }
    public FinalBL2(int num){
        this.NUM = num;
    }
}
class Test2{
    public static void main(String[] args) {
        /*
            final修饰成员变量:
                被修饰的成员变量只能赋值一次
         */
        FinalBL fb = new FinalBL();
        System.out.println(fb.NUM);
        //编译报错:因为被final修饰的变量只能赋值一次
        //fb.num = 20;
    }
}
