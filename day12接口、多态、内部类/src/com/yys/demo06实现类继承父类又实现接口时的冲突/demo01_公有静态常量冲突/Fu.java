package com.yys.demo06实现类继承父类又实现接口时的冲突.demo01_公有静态常量冲突;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/14:59
 */
public class Fu {
    public static final int NUM1 = 10;
    public static final int NUM2 = 100;
}
interface A{
    public static final int NUM1 = 20;
}
class Zi extends Fu implements A{

}

class Test{
    public static void main(String[] args) {
        /*
            公有静态常量的冲突:子类无法继承有冲突的常量;
         */
        //System.out.println(Zi.NUM1);//编译报错
        System.out.println(Zi.NUM2);
    }
}
