package com.yys.demo08_扩展动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/19/13:59
 */
public class Test {
    public static void main(String[] args) {
        /*
            对Collection接口进行代理，以前的remove(Object obj)方法是删除集合中第一次出现的元素
            (比如集合中有多个“abc”,调用remove(“abc”)后只会删除一个元素)。
            代理后，要求在调用remove(Object obj)方法后，能够删除集合中所有匹配的元素。【动态代理】
         */
        //创建集合
        Collection<String> col = new ArrayList<>();
        //添加元素
        col.add("abc");
        col.add("abc");
        col.add("abc123");
        col.add("cba");
        col.add("acb");
        col.add("abd");
        col.add("abds");
        System.out.println("删除前:"+col);

        //动态代理增强remove()方法
        Collection<String> proxy = (Collection<String>) Proxy.newProxyInstance(col.getClass().getClassLoader(), col.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object res = method.invoke(col, args);
                if (method.getName().equals("remove")){
                    //删除集合里面的abc,首先要遍历这个集合
                    Iterator<String> it = col.iterator();
                    while (it.hasNext()){
                        //判断遍历出来的元素是否是要删除的("abc")
                        String s = it.next();
                        if (s.equals(args[0])){
                            it.remove();
                        }
                    }
                }
                return res;
            }
        });

        //删除代理对象
        boolean res = proxy.remove("abc");
        System.out.println(res);
        System.out.println("删除后:"+ col);
    }
}
