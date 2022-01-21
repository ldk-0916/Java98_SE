package com.yys.demo09多态时访问成员特点;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/9:30
 */
public class Test {
    public static void main(String[] args) {
        /*
            多态访问成员的特点:
                成员变量:编译看父类,运行看父类(编译看左,运行看左)
                成员方法:
                    1.非静态:编译看父类,运行看子类(编译看左,运行看右)
                    2.静态:编译看父类,运行看父类
                  总结:除了非静态方法编译看父类,运行看子类,其余都是看父类
                 注意:多态的情况下无法访问子类独有方法的...
         */
        //父类引用指向子类对象
        Animal anl = new Dog();
        System.out.println(anl.num);//10
        anl.method1();//Dog的非静态方法...method1
        anl.method2();//Animal的静态方法...method2
        //anl.method3();
    }
}
