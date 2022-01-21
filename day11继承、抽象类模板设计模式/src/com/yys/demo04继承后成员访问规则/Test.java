package com.yys.demo04继承后成员访问规则;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/13:49
 */
public class Test {
    public static void main(String[] args) {
        /*
            继承后成员访问规则:
                继承后构造方法访问规则:父类的构造方法子类无法继承
                继承后私有成员访问规则:子类是可以继承,但是无法直接访问
                继承后非私有成员访问规则:子类是可以继承,优先访问子类的,如果子类没有就去父类中找,找到就用,找不到就报错
         */
        //构造方法
        //Zi zi = new Zi(20);//编译报错,因为子类中没有有参构造方法
        System.out.println("--------------------------------------------");

        //验证私有访问规则
        //Zi zi = new Zi();
        //System.out.println(zi.name);//编译报错
        //zi.method1();//编译报错

        //非私有成员验证:
        Zi zi = new Zi();
        System.out.println(zi.sex);
        zi.method2();
    }
}
