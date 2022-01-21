package com.yys.demo03_代码块.demo02_静态代码块;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/11:05
 */
public class Test {
    public static void main(String[] args) {
        /*
            静态代码块:
                格式:static{}
                位置:类中,方法外
                执行:随着类的加载而执行,并且只执行一次
                使用场景:例如配置文件的数据,加载驱动,也就说程序中只需要执行一次的代码就可以放在静态代码块
                执行优先级: 静态代码块 > 构造代码块 >构造方法
         */
        Person p1 = new Person();
        Person p2 = new Person();

    }
}
