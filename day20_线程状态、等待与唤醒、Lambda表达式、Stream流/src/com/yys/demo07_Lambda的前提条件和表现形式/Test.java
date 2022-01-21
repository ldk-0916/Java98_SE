package com.yys.demo07_Lambda的前提条件和表现形式;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/11:05
 */
public class Test {
    public static void main(String[] args) {
        /*
            Lambda前提条件:
                必须具有接口,而且接口中抽象方法有且仅有一个
                如果一个接口中有且仅有一个抽象方法,这个接口就叫做函数式接口
            Lambda的表现形式
                变量的形式:变量的类型是函数式接口类型,那么可以赋值一个Lambda表示
                参数的形式:方法的参数类型是函数式接口,那么就看可以传入一个Lambad表达式
                返回值的形式:方法的返回值类型为函数式接口类型,那么就可以返回一个Lambda表达式

         */
        //变量形式
        Runnable rb = () ->{
            System.out.println("任务代码...");
        };

        //参数形式
        //创建集合排序
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(9);
        list.add(21);
        System.out.println("排序前:"+list);
        //升序排序:Lambda省略格式
        Collections.sort(list,(o1, o2) -> {return o1 - o2;});
        System.out.println("排序后:"+list);
        Collections.sort(list,getCompare());
    }

    //返回值类型
    private static Comparator<Integer> getCompare() {
        return (Integer o1,Integer o2) ->{
            return o1 - o2;
        };
    }
}
