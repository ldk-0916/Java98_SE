package com.yys.demo11_Stream流综合案例;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/08/15:42
 */
public class Test {
    public static void main(String[] args) {
        /*
            现在有两个`ArrayList`集合存储队伍当中的多个成员姓名，要求使用Stream流,依次进行以下若干操作步骤：
                    1. 第一个队伍只要名字为3个字的成员姓名；
                    2. 第一个队伍筛选之后只要前3个人；
                    3. 第二个队伍只要姓张的成员姓名；
                    4. 第二个队伍筛选之后不要前2个人；
                    5. 将两个队伍合并为一个队伍；
                    6. 根据姓名创建`Person`对象；
                    7. 打印整个队伍的Person对象信息。
         */
        List<String> list1 = new ArrayList<>();
        list1.add("庄子");
        list1.add("老子");
        list1.add("圣枪哥");
        list1.add("小学弟");
        list1.add("Vip");
        list1.add("妹控");
        list1.add("jiejie");
        list1.add("厂长");

        List<String> list2 = new ArrayList<>();
        list2.add("张三丰");
        list2.add("脏无忌");
        list2.add("张学友");
        list2.add("张惠妹");
        list2.add("张二狗");
        //1. 第一个队伍只要名字为3个字的成员姓名；
        //2. 第一个队伍筛选之后只要前3个人；
        Stream<String> stream1 = list1.stream().filter((String s) ->{
            return s.length() == 3;
        }).limit(3);

        //3. 第二个队伍只要姓张的成员姓名；
        //4. 第二个队伍筛选之后不要前2个人；
        Stream<String> stream2 = list2.stream().filter((String s) -> {
            return s.startsWith("张");
        }).skip(2);

        //    5. 将两个队伍合并为一个队伍；
        //    6. 根据姓名创建`Person`对象；
        //7. 打印整个队伍的Person对象信息。
        Stream.concat(stream1,stream2).map((String name) ->{
            return new Person(name);
        }).forEach((p -> System.out.println(p)));
    }
}
