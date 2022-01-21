package com.yys.demo01_权限修饰符;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/10:39
 */
public class Test {
    public static void main(String[] args) {
        /*
            权限修饰符
                概述:在java中提供了四种访问修权限修饰符,使用不同的访问权限修饰符时,被修饰的内容会有不同的访问权限
                public:公共的
                protected:受保护的
                private:私有的
         */
        //
        A a = new A();
        a.method1();
        a.method2();
        a.method3();
        //a.method4()//编译报错,没有访问权限
    }
}
