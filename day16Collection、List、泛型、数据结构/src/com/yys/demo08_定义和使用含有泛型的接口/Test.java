package com.yys.demo08_定义和使用含有泛型的接口;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/14:10
 */
public class Test {
    public static void main(String[] args) {
        /*
            定义含有泛型的接口:
                格式:修饰符 interface 接口名<代表泛型的变量>{ }
                泛型的变量:任意字母
                使用含有泛型接口再 确定泛型接口的具体类型

                1.通过实现类的方式确定接口泛型的具体类型
                    public class 类名 implements 接口名<具体数据类型>{...}

                2.实现类实现接口时候不确定泛型具体类型,而是创建对象的时候再去确定接口泛型的具体类型
                public class 类名<泛型变量> implements 接口名<泛型变量>
         */
        //创建实现类对象,确定接口的泛型类型
        Imp2<String> imp2 = new Imp2<>();
        imp2.method1("张三");
        String s = imp2.method2("yys");
        System.out.println(s);

    }
}
