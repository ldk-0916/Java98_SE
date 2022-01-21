package com.yys.demo03_迭代器常见的问题;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/10:43
 */
public class Test2 {
    public static void main(String[] args) {
         /*
            迭代器常见的问题:
                问题二:在进行集合元素迭代时，如果添加或移除集合中的元素 , 将无法继续迭代 ,
                将会抛出ConcurrentModificationException并发修改异常.

         */
        //创建Collection
        Collection<String> col = new ArrayList<>();
        col.add("张三");
        col.add("罗翔");
        col.add("张伟");
        col.add("南山必胜客");

        //获取迭代器对象
        Iterator<String> it = col.iterator();
        //进行判断是否有元素可以进行迭代
        while (it.hasNext()){
            //获取迭代元素
            String e = it.next();
            System.out.println(e);

            //添加元素到集合中
           /* col.add("老干妈");//并发修改异常ConcurrentModificationException
            col.remove("罗翔");//并发修改异常ConcurrentModificationException
            */

            //如果得迭代出来的元素是罗翔,就删除
            if (e.equals("罗翔")){
                it.remove();
            }
        }
        System.out.println("集合:"+col);
    }
}
