package com.yys.demo05_接口与接口之间的关系.demo03_公有默认方法的冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/14:06
 */
public interface A {
    public default void method(){
        System.out.println("A接口的默认方法...method");
    }
}
interface B {
    public default void method(){
        System.out.println("B接口的默认方法...method");
    }
}
interface Imp extends A,B{

    @Override
    default void method() {
        System.out.println("重写父接口中的method方法");
    }
}
class Test{
    public static void main(String[] args) {
        /*
            公有默认方法得冲突:子接口必须重写一次有冲突的默认方法
            面试题:
                实现类重写接口中的默认方法,不需要加default;
                子接口重写父接口中的默认方法,需要加default;
         */

    }
}
