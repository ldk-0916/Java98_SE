package com.yys.demo18引用类型使用小结.demo02_抽象类作为方法参数和返回值;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/13/9:15
 */
public class Test {
    public static void main(String[] args) {
        /*
               1.抽象类作为形参：表示可以接收任何此抽象类的"子类对象"作为实参；
               2.抽象类作为返回值：表示"此方法可以返回此抽象类的任何子类对象"；
         */
        //调用method1方法就要传入Animal的子类对象
        //Animal anl = new Dog();
        method1(new Dog());
        System.out.println("=============================================");
        method1(new Animal() {
            @Override
            public void eat() {
                System.out.println("匿名内部类的传递方式..");
            }
        });
        System.out.println("-----------------------------------------------");
        //Animal animal = method2();
        Dog dog = (Dog) method2();
        dog.eat();
    }

    //抽象类作为方法参数
    public static void method1(Animal anl){
        anl.eat();
    }

    //抽象类作为方法返回值
    public static Animal method2(){
        return new Dog();
    }
}
