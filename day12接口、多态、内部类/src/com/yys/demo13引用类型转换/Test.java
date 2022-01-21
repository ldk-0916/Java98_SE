package com.yys.demo13引用类型转换;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/13:39
 */
public class Test {
    public static void main(String[] args) {
        /*
            引用类型的转换:
                向上转型:子类类型向父类类型向上转换的过程,这个过程小转大,不需要强转
                向下转型:父类类型向子类类型向下转换的过程,这个过程大转小,需要强转
                    格式:子类类型 对象名 = (子类类型)父类类型变量;
                    注意:
                        1.右边父类类型的变量一定要指向要转型的子类类型的对象
                        2.不管是向上还是向下转型,一定满足父子(继承)或者实现关系
         */
        //向上转型
        Animal anl = new Dog();

        //向下转型
        Dog dog = (Dog) anl;
        System.out.println("----------------------------------------");
        //注意:右边父类类型的变量一定要指向要转型的子类类型的对象
        Animal anll = new Animal();
       // Dog dog1 = (Dog) anll;//运行时异常,类型在转换异常 java.lang.ClassCastException
        System.out.println("===============================");

     /*   Animal anl2 = new Cat();
        Dog dog2 = (Dog) anl2;//java.lang.ClassCastException
        System.out.println(dog2);*/

        System.out.println("-=-==----------===============");
        //Animal animal = new Person();//编译报错,animal和person不是父子关系
    }
}
