package com.yys.demo04_多实现时的几种冲突情况.demo03_公有默认方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/13:38
 */
public interface A {
    public default void method(){
        System.out.println("A接口的默认方法method");
    }
}
interface B{
    public default void method(){
        System.out.println("B接口的默认方法method");
    }
}

class Imp implements A,B{

    @Override
    public void method() {
        System.out.println("实现类重写了默认方法method");
    }
}
class Test{
    public static void main(String[] args) {
        /*
            公有默认方法冲突:实现类必须重写一次最终版本
         */
        Imp imp = new Imp();
        imp.method();
    }
}
