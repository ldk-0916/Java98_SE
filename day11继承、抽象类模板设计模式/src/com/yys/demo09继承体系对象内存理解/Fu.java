package com.yys.demo09继承体系对象内存理解;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/9:24
 */
public class Fu {
    int num = 10;
    int numFu = 20;
    public void method(){
        System.out.println("Fu method");
    }
}
class Zi extends Fu{
    int num = 20;
    int numZi = 200;
    public void method(){
        System.out.println("Zi method");
    }

    public void show(){
        int num = 30;
        System.out.println("局部变量num:"+num);//30
        System.out.println("本类成员变量numZi:"+numZi);//200
        System.out.println("父类成员变量numFu:"+numFu);//20
        //访问本类成员方法
        this.method();
        //访问父类成员方法
        super.method();
    }
}
class Test{
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}