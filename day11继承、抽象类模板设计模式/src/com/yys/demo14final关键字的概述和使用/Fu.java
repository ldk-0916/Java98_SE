package com.yys.demo14final关键字的概述和使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/13:41
 */
//final修饰的类不能被继承
public  class Fu {
    public void method1(){}

    public final void method2(){}
}
class Zi extends Fu{
    @Override
    public void method1(){

    }

    //编译报错:final修饰的方法不可以重写
/*    @Override
    public void method2(){

    }*/

        /*
            修饰类:被final修饰的类不能被继承
            格式:
                修饰符 final class 类名{方法体}

            修饰方法:被final修饰的不能被重写
                修饰符 final 返回值类型 方法名(参数列表)
         */
}

