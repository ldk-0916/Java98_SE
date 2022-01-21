package com.yys.demo02_Iterator接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/9:46
 */
public class Test {
    public static void main(String[] args) {
        /*
            迭代:
                即Collection集合元素的通用获取方式。在取元素之前先要判断集合中有没有元素，如果有，就把这个元素取出来，
                继续再判断，如果还有就再取出来。一直把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。获取迭代器对象

            获取迭代器对象:
                使用Collection集合中的Iterator接口中的方法
                public Iterator iterator()
            判断集合中是否有元素可以进行迭代:使用iterator接口中的
                hasNext()方法;
            获取集合中可以迭代的元素:使用Iterator接口中的
                    public E next()方法;
         */
        //1.创建Collection集合对象,...String
        Collection<String> col = new ArrayList<>();
        col.add("张三");
        col.add("罗翔");
        col.add("张伟");
        col.add("南山必胜客");

        //2..获取迭代器对象
        Iterator<String> it = col.iterator();
        //3.进行判断,集合中是否有元素可以迭代
        while(it.hasNext()){
            //说明有元素可以迭代
            String e = it.next();
            System.out.println(e+" ");
        }
    }
}
