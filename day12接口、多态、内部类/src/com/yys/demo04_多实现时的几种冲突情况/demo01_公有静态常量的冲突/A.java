package com.yys.demo04_多实现时的几种冲突情况.demo01_公有静态常量的冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/11:17
 */
public interface A {
    //公共常量
    public static final int NUM1 = 10;
}
interface B{
    public static final int NUM1 = 20;
    public static final int NUM2 = 30;
}
class Imp implements A,B{
}

class Test{
    public static void main(String[] args) {
        /*
            公有静态常量冲突:如果多个接口中有相同的常量,那么实现类就无法继承(实现类不继承冲突常量)
         */
        //System.out.println(Imp.NUM1);//编译报错,无法访问
        System.out.println(A.NUM1);
        System.out.println(Imp.NUM2);
    }
}
