package com.yys.demo21_方法引用的分类;

import java.util.ArrayList;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/18/10:42
 */
public class Test2_静态方法的引用 {
    public static void main(String[] args) {
        /*
            静态方法引用:
                类名::方法名
         */
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        //把集合中的元素转换为int类型,打印输出
        //获取流,映射
        list.stream().map((String str) ->{
            return Integer.parseInt(str);
        });
        //lambda
        list.stream().map(Integer::parseInt).forEach(i -> System.out.println(i));
    }
}
