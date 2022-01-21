package com.yys.demo16static关键字修饰成员方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/15:50
 */
public class Test {
    public static void main(String[] args) {
        /*
            概述:被static修饰的方法就是静态方法,否则就是非静态方法
            static修饰成员方法: 修饰符 static 返回值类型 方法名(形参){}
                访问静态方法:
                    对象名.静态方法(参数) :不推荐
                    类名.静态方法(参数)   推荐

         */
        ChinesePeople.method3();//推荐

        ChinesePeople p = new ChinesePeople();
        p.method3();//不推荐
        p.method1();//
    }

}
