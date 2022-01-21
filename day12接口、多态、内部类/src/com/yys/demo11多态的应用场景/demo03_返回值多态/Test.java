package com.yys.demo11多态的应用场景.demo03_返回值多态;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/10:56
 */
public class Test {
    public static void main(String[] args) {
        //返回值多态:如果返回值类型为父类类型,就可以返回父类对象或者所有子类对象
        Animal an = method();
        an.eat();
    }
    public static Animal method(){

        return new Cat();
    }
}
