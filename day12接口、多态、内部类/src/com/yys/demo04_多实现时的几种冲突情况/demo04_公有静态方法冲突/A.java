package com.yys.demo04_多实现时的几种冲突情况.demo04_公有静态方法冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/13:43
 */
public interface A {
    public static void method(){
        System.out.println("A接口的静态方法method");
    }
}
interface B{
    public static void method(){
        System.out.println("B接口的静态方法method");
    }
}
class Imp implements A,B{

}
class Test{
    /*
        公有静态方法冲突:静态方法是属于接口,不能被继承,所以不存在冲突
     */
}