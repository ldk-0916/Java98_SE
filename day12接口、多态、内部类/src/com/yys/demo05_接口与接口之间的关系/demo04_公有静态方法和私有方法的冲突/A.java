package com.yys.demo05_接口与接口之间的关系.demo04_公有静态方法和私有方法的冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/14:13
 */
public interface A {
    public static void method(){
        System.out.println("A接口的静态方法method");
    }
}
interface B {
    public static void method(){
        System.out.println("B接口的静态方法method");
    }
}
interface C extends A,B{

}
class Test{
    public static void main(String[] args) {
        /*
            公有静态方法的冲突:不会冲突,因为静态方法是直接属于接口的,只供本接口直接使用
         */
        //C.method();//编译报错,因为没有继承
    }
}
