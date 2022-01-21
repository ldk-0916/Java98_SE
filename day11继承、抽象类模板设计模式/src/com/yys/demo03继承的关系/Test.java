package com.yys.demo03继承的关系;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/11:25
 */
public class Test {
    public static void main(String[] args) {
        /*
            继承的格式:
                public class 父类名{}

                public class 子类名 extends 父类名{}
                注意:java是单继承,一个类只能继承一个父类,不要为了继承而继承,一定要满足is a的关系
                    例:学生 is a person 可以
                       狗不可以继承人类

                 继承的优点:
                 1.提高了代码复用性;把类中一些共性的属性抽取到一个父类中,子类可以直接调用
                 2.类与类之间产生关联
         */
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(18);
        System.out.println(stu.getName()+":"+stu.getAge());
        stu.eat();
        stu.drink();
        stu.sleep();

        System.out.println("==============================");
            Teacher t1 = new Teacher();
            t1.eat();
        System.out.println("==================");
        Dog dog = new Dog();
        dog.eat();
    }
}
