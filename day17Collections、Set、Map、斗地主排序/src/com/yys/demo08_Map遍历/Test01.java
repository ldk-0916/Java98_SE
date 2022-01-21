package com.yys.demo08_Map遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/14:52
 */
public class Test01 {
    public static void main(String[] args) {
        /*
            键找值:
                1.获取Map集合中所有的键
                2.循环遍历Map集合中所有的键
                3.在循环中,根据k找v
         */
        //1.创建Map集合
        Map<String,String> map = new HashMap<>();

        //2.添加键值对
        map.put("岳云鹏","孙岳");
        map.put("郭德纲","于谦");
        map.put("张鹤伦","郎鹤焱");

        //根据键找值
        Set<String> keys = map.keySet();
        //System.out.println(map);
        //遍历集合
        for (String key : keys) {
            String values = map.get(key);
            System.out.println(key+"="+values);
        }
    }
}
