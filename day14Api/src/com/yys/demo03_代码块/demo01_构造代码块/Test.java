package com.yys.demo03_代码块.demo01_构造代码块;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/10:57
 */
public class Test {
    public static void main(String[] args) {
        /*
            构造代码块:
                格式{}
                位置:类中,方法外
                执行:每次执行构造方法之前都会执行一次
                使用场景:用来统计对象的个数,也就是每次执行构造方法之前要执行的代码就可以放在构造代码块中
         */
        Person p1 = new Person();
        Person p2 = new Person();
        p1.method();
    }
}
