package com.yys.demo03_迭代器常见的问题;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/10:32
 */
public class Test1 {
    public static void main(String[] args) {
        /*
            迭代器常见的问题:
                问题一:在进行元素获取时,如果集合中已经没有元素可以迭代了,我们还继续使用迭代器的next方法进行获取,会出现什么问题?
                会抛出异常:java.util.NoSuchElementException:没有集合元素异常

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
        }
        System.out.println("=======================================================");
        //再获取集合中的元素
        //String n = it.next();// java.util.NoSuchElementException

        //如果迭代完了,还想继续迭代?怎么办?  从新获取一个迭代器
        Iterator<String> it2 = col.iterator();
        //省略....
    }
}
