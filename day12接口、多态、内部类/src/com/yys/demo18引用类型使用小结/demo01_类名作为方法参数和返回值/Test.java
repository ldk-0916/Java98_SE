package com.yys.demo18引用类型使用小结.demo01_类名作为方法参数和返回值;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/16:44
 */
public class Test {
    public static void main(String[] args) {
        /*
            类名作为方法参数和返回值
         */
        //创建Person对象
        Person p = new Person("张三",18);
        method(p);

        //调用method2()
        Person person = method2(p);//就是地址值
        person.show();
    }


    public static Person method2(Person p) {
        p.age = 24;
        return p;
    }

    //类名作为方法的参数类型
    public static void method(Person p) {
        p.show();//张三,18
    }
}
