package com.yys.demo08_Map遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/15:00
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            Entry<K,V>接口:简称Entry项,表示键值对对象,用来封装Map集合中的键值对
            Entry<K,V>接口:是Map接口中的内部接口,在外部使用的时候是这样表示: Map.Entry<K,V>

            Map集合中提供了一个方法来获取所有键值对对象:
            public Set<Map.Entry<K,V>> entrySet()

            根据键值对对对象获取键和值:
                        - public K getKey()：获取Entry对象中的键。
                        - public V getValue()：获取Entry对象中的值。

            Map遍历方式二:根据键值对对象的方式
                        1.获取集合中所有键值对对象，以Set集合形式返回。  Set<Map.Entry<K,V>> entrySet()
                        2.遍历所有键值对对象的集合，得到每一个键值对(Entry)对象。
                        3.在循环中,可以使用键值对对对象获取键和值   getKey()和getValue()
         */
        //创建集合
        Map<String,String> map = new HashMap<>();
        //2.添加键值对
        map.put("岳云鹏","孙岳");
        map.put("郭德纲","于谦");
        map.put("张鹤伦","郎鹤焱");

        //方式二:键值对对象
        //获取集合中所有的键值对 对应的 键值对对象 entrySet方法
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        //循环遍历所有键值对对象
        for (Map.Entry<String, String> entry :entrySet) {
            //根据键值对对象获取键和值
            String keys = entry.getKey();
            String values = entry.getValue();
            System.out.println(keys + "=" + values);
        }

    }
}
