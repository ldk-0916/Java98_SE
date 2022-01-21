package com.yys.demo05方法重写;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/08/14:14
 */
public class Test {
    public static void main(String[] args) {
        /*
            方法的重写:
                概念:子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），
                     会出现覆盖效果，也称为重写或者复写。声明不变，重新实现。

                注意事项:
                    1.一定要是父子类关系
                    2.子类中重写的方法返回值类型,方法名,参数列表一定要和父类一模一样
                    3.子类中重写父类方法可以使用@Override注解进行标识,如果不是重写,注解会报错;
                       建议开发中重写的方法使用Override注解标识,可以提高代码可读性
                    4.子类重写父类的方法的权限不能低于父类的访问权限
                    访问权限:public > protected > 默认的(空) > private
         */
        Zi zi = new Zi();
        zi.method();
    }
}
