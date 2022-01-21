package com.yys.demo06实现类继承父类又实现接口时的冲突.demo04_公有静态方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/11/15:20
 */
public class Fateher {
    public static void method(){
        System.out.println("Father类中的静态方法 method");
    }
}
interface A{
    public static void method(){
        System.out.println("A接口中的静态方法");
    }
}
class Son extends Fateher implements A{

}

class Test{
    public static void main(String[] args) {
        /*
            公有静态方法的冲突:只能访问父类的静态方法
         */

        Son.method();
    }
}