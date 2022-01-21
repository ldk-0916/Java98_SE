package com.yys.demo10多态的形式.demo01_普通父类多态;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/9:57
 */
public class Fu {
}
class Zi extends Fu{

}

class Test{
    public static void main(String[] args) {
        //父类引用指向子类对象
        Fu f = new Zi();//多态
    }
}
