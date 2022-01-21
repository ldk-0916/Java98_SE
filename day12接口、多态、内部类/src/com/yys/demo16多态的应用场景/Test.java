package com.yys.demo16多态的应用场景;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/14:30
 */
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        method(d);
        System.out.println("===========");
        Cat cat = new Cat();
        method(cat);
    }
    //形参多态:如果父类类型作为方法的形参类型,那么就可以接收该父类类型的对象或者其所有子类的对象
    public static void method(Animal anl){
        anl.eat();
        //anl.catchMouse();//编译报错
        if (anl instanceof Dog){
            Dog dog = (Dog) anl;
            dog.sleep();
        }
        if (anl instanceof Cat){
            Cat cat = (Cat) anl;//向下转型
            cat.catchMOuse();
        }
    }
}
