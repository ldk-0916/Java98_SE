package com.yys.demo05_toString方法;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/11:26
 */
public class Test {
    public static void main(String[] args) {
        /*
            Object类的toString方法:
                public String toString()：返回该对象的字符串表示，
            特点:
                1.toString方法返回的字符串内容格式为:对象的类型名+@+十六进制的内存地址值。
                2.直接打印对象名,其实就是打印对象调用toString的方法返回的字符串内容
            考虑:如果打印对象的时候,不希望是地址值这样的字符串形式,怎么办?
            解决:重写toString方法----->我们可以自定返回字符串的内容格式,也可以快捷键生成()
            []
         */
        //创建Object对象
        Object obj = new Object();
        System.out.println(obj.toString());//java.lang.Object@1540e19d
        System.out.println(obj);//java.lang.Object@1540e19d

        System.out.println("================================");
        Person p1 = new Person("张三",18);
        //因为  p1调用了toString方法,因为java中所有的类都继承了Object类
        System.out.println(p1);//Person{name='张三', age=18}
        System.out.println(p1.toString());//com.yys.demo05_toString方法.Person@677327b6

    }
}
