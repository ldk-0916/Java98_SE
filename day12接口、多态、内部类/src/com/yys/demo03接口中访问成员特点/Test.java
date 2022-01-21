package com.yys.demo03接口中访问成员特点;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/10:58
 */
public class Test {
    public static void main(String[] args) {
        /*
            接口中成员访问特点:
                常量:供接口名直接访问的
                抽象方法:供实现类重写的
                默认方法:实现类重写或者实现类对象直接调用
                静态方法:只供接口名直接调用
                私有方法:只能在本接口中调用
         */

        //访问常量
        System.out.println(IA.NUM);//推荐..
        System.out.println(Imp.NUM);//不推荐...常量被实现类继承了
        Imp imp = new Imp();
        //默认方法
        imp.method2();

        //接口名访问静态方法
        //imp.method3();//不可以使用实现类对象调用
        IA.method3();//只能用接口名直接调用

        //私有方法
        //imp.metho4();//编译报错:私有方法只能在本接口中调用
    }
}
