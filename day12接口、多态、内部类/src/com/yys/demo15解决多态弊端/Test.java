package com.yys.demo15解决多态弊端;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/14:15
 */
public class Test {
    public static void main(String[] args) {
        Animal anl = new Dog();
        anl.eat();
        //anl.JiDu();

        //先判断后转型
        if (anl instanceof Dog){
            Dog dog = (Dog) anl;
            dog.JiDu();
        }
    }
}
