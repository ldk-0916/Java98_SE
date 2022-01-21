package com.yys.fy01;

/**
 用循环输出10次HelloWorld当%5等于0时跳出循环不再执行
 */
public class Demo02Break {
    public static void main(String[] args) {
        for (int i = 1;i <= 10;i++){
            //当i为5时, i % == 0;这个条件成立;执行if{方法体}里面的内容break;一旦执行,就结束本次循环;后面的循环次数也不再执行
            if (i % 5 == 0){
                break;
            }
            System.out.println("HelloWorld");
        }
    }
}
