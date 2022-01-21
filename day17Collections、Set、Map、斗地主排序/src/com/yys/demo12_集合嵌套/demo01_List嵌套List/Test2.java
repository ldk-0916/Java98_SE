package com.yys.demo12_集合嵌套.demo01_List嵌套List;

import java.util.*;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/16:31
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            List嵌套Map:List集合里面的元素是Map集合
         */
        //创建Map集合
        Map<String,String> map1 = new HashMap<>();
        map1.put("张三","苏大");
        map1.put("李四","科大");

        //同上
        Map<String,String> map2 = new HashMap<>();
        map2.put("王五","南大");
        map2.put("赵六","厦大");

        //创建List集合,存储map1和map2
        List<Map<String,String>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        System.out.println(list);

        //遍历
        for (Map<String,String> map : list) {
            Set<String> keySet = map.keySet();
            for (String e : keySet) {
                System.out.println(e+"="+map.get(e));
            }
        }
    }
}
