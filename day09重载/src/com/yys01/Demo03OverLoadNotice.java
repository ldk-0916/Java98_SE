package com.yys01;

/**
 *重载注意事项:
 *  1.数量不同
 *  2.类型不同
 *  3.多个类型,顺序不同
 */
public class Demo03OverLoadNotice {
    public static void main(String[] args) {

    }
    //1.只有一个int类型
    public static void method(int num){

    }
    //2.两个int
    public static void method(int num,int numone){

    }
    //3.一个double类型
    public static void method(double num){

    }

    //4.
    public static void method(int num,double b){

    }
    //5,  4和5参数类型顺序不同
    public static void method(double b,int num){

    }

}
