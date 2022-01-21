package com.yys.demo06实现类继承父类又实现接口时的冲突.demo03_公有默认方法的冲突;


/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/15:10
 */
public class Fu {
    public void method(){
        System.out.println("Fu中的默认方法method");
    }
}
interface A{
    public default void method(){
        System.out.println("A接口中的默认方法method");
    }
}
class Zi extends Fu implements A{

}
class Test{
    public static void main(String[] args) {
        /*
            公有没默认方法:优先访问父类的
         */
        Zi zi = new Zi();
        zi.method();//Fu中的默认方法method
    }
}