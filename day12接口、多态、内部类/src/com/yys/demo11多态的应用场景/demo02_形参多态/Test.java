package com.yys.demo11多态的应用场景.demo02_形参多态;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/10:43
 */
public class Test {
    public static void main(String[] args) {
        //形参多态:参数类型作为父类类型,该参数就可以接收该父类类型的对象或者所有子类对象
        Dog d = new Dog();
        method(d);

        Cat c = new Cat();
        method(c);
    }

    //需求:定义一个方法,带参数,该参数可以接收Animal对象以及类子对象
    //method(d)===>Animal anl = new Dog();
    public static void method(Animal anl) {
        anl.eat();//狗啃骨头...
    }
    /*public static void method(Dog anl){
        anl.eat();
    }*/
}
