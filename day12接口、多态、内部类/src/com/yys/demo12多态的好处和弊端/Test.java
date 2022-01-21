package com.yys.demo12多态的好处和弊端;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/11:11
 */
public class Test {
    public static void main(String[] args) {
        /*
            好处:提高了代码的复用性
            弊端:无法访问子类独有的方法或者变量,因为多态的特点是编译看父类
         */
        //父类引用指向子类对象
        Animal anl = new Dog();
        anl.eat();
        //anl.JiDu();
    }
}
