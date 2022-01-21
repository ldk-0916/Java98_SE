package com.yys.demo06_定义和使用含有泛型的类;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/13:33
 */
public class Test {
    public static void main(String[] args) {
        /*
            定义含有泛型的类:
                public class 类名<泛型变量>{

                }
                f泛型变量的位置:写任意字母,例如A,B,C..a,b,c... 一般会用T,E
                使用含有泛型的:创建该类对象的时候,再去确定泛型的具体类型

                什么时候定义泛型的类?:
                        当我们类中的成员变量或者成员方法的 形参类型/返回值类型 不确定的时候,我们就可以把这个类定义为含有泛型的类

         */
        MyArrayList<String> list = new MyArrayList<>();
        //给类的成员变量赋值
        list.e = "java集合学习";
        String res1 = list.method1("风云");
        System.out.println(res1);
        System.out.println("=========================================");

        MyArrayList<Integer>  list2 = new MyArrayList<>();
        list2.e = 100;
        Integer res2 = list2.method1(100);
        System.out.println(res2);//100

    }
}
