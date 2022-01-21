package com.yys.demo10多态的形式.demo02_抽象父类多态;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/9:59
 */
public abstract class Fu {
}
class Zi extends Fu{

}
class Test{
    public static void main(String[] args) {
        //抽象父类多态
        //父类引用指向子类对象
        Fu f = new Zi();//多态
    }
}
