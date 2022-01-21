package com.yys.demo06方法重写的使用场景;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/14:35
 */
public class Test {
    public static void main(String[] args) {
        /*
            方法重写的使用场景
                  当父类的方法无法满足子类的需求,子类就回去重写父类方法
         */
        //创建子类对象
        Zi zi = new Zi();
        zi.sport();
        //调用跑步方法
        zi.run();
    }
}
