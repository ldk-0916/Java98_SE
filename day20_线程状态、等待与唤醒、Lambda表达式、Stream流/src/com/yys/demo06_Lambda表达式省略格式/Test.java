package com.yys.demo06_Lambda表达式省略格式;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/10:48
 */
public class Test {
    public static void main(String[] args) {
        /*
            Lambda表达式省略格式
                1. 小括号内参数的类型可以省略；
                2. 如果小括号内有且仅有一个参数，则小括号可以省略；
                3. 如果大括号内有且仅有一条语句，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。
         */
        new Thread(() ->{
            System.out.println("任务代码...");
        }).start();

        //创建集合排序
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(9);
        list.add(21);
        System.out.println("排序前:"+list);
        //升序排序:Lambda省略格式
        Collections.sort(list,(o1,o2) -> o1 - o2);
        System.out.println("排序后:"+list);

        //Lambda标准格式
        show((int num) -> {
            System.out.println(num);
        });

        //省略格式
        show(num ->
                System.out.println(num));

    }

    public static void show(A a){
        a.method(10);
    }
}
