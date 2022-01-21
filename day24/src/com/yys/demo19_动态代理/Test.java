package com.yys.demo19_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/9:23
 */
public class Test {
    public static void main(String[] args) {
            /*
                动态代理
                    概述:通过反射生成一个代理对象,代理对象所属的类是不需要存在的
                动态代理获取:
                    - jdk提供一个Proxy类可以直接给实现接口类的对象直接生成代理对象
                 Java.lang.reflect.Proxy类可以直接生成一个代理对象

                - Proxy.newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)生成一个代理对象
                  - 参数1:ClassLoader loader 被代理对象的类加载器
                  - 参数2:Class<?>[] interfaces 被代理对象的要实现的接口
                  - 参数3:InvocationHandler h (接口)执行处理类
                  - 返回值: 代理对象
                  - 前2个参数是为了帮助在jvm内部生成被代理对象的代理对象,第3个参数,用来监听代理对象调用方法,帮助我们调用方法
                - InvocationHandler中的Object invoke(Object proxy, Method method, Object[] args)方法：调用代理类的任何方法，此方法都会执行
                  - 参数1:代理对象(慎用)
                  - 参数2:当前执行的方法
                  - 参数3:当前执行的方法运行时传递过来的参数
                  - 返回值:当前方法执行的返回值

             */
            //创建金莲对象
            JinLian jl = new JinLian();
            //动态获取JinLian的代理对象
        Happy happy = (Happy) Proxy.newProxyInstance(JinLian.class.getClassLoader(), JinLian.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("happy")) {
                    System.out.println("王婆以做头发的名义把金莲和门庆关在一间小屋里...");
                    //通过反射来调用被代理对象的方法
                    method.invoke(jl);
                    System.out.println("王婆开始打扫卫生了...");
                }
                return null;
            }
        });

        //代理对象调用代理方法
        happy.happy();
    }
}
