package com.yys.demo05_接口与接口之间的关系.demo01_公有静态常量冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/13:51
 */
public interface A {
    public static final int NUM1 = 10;
}
interface B{
    public static final int NUM1 = 20;
    public static final int NUM2 = 30;
}
interface C extends A,B{

}
class Test{
    public static void main(String[] args) {
        /*
            注意:接口可以“继承”自另一个“接口”，而且可以“多继承”。
            类不可以多继承,但是可以多层继承

            公有静态常量冲突:子接口无法继承父接口中的冲突常量
         */
        //System.out.println(C.NUM1);//编译报错,说明无法继承
        System.out.println(C.NUM2);
    }
}
