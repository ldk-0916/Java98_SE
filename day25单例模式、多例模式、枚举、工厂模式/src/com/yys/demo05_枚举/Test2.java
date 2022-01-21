package com.yys.demo05_枚举;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/10:40
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            概念:
                枚举是一种引用类型数据,java中的枚举是有固定个数对象的"特殊类"。
                如果有些类的对象是固定个数的，就可以定义成枚举。比如性别,季节，方向
            public enum 枚举名{
                    //第一行都是罗列枚举实例,名字大写即可
            }

            给枚举变量赋值:枚举名 变量名 = 枚举名.枚举值
            获取枚举值:枚举名.枚举值
         */
        Sex boy = Sex.BOY;
        Sex girl = Sex.GIRL;
        Sex yao = Sex.YAO;
        System.out.println(boy);
        System.out.println(girl);
        System.out.println(yao);
        Sex.BOY.show();
        Sex.GIRL.show();

        Person p = new Person("张三",Sex.BOY);
    }
}
