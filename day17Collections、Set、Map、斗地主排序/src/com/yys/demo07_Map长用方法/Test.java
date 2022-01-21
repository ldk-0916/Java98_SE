package com.yys.demo07_Map长用方法;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/13:53
 */
public class Test {
    public static void main(String[] args) {
        /*
            - `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
            - `public V remove(Object key)`: 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            - `public V get(Object key)` 根据指定的键，在Map集合中获取对应的值。
            - `public boolean containsKey(Object key)`:判断该集合中是否有此键
            - `public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
            - `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。
         */
        //创建Map集合
        Map<String,String> map = new HashMap<>();
        //往集合中添加键值对
        map.put("王宝强","马蓉");
        map.put("贾乃亮","李小璐");
        map.put("陈羽凡","白百何");
        System.out.println(map);

        //Map集合键是惟一的,如果重复?会覆盖(值给覆盖)
        String s1 = map.put("王宝强", "王宝弱");
        System.out.println("s1:"+s1);//马蓉
        System.out.println(map);//{贾乃亮=李小璐, 王宝强=王宝弱, 陈羽凡=白百何}

        //map集合值可以重复?它的值可以重复
        String s2 = map.put("pgOne", "李小璐");
        System.out.println(s2);//null;
        System.out.println(map);

        //map集合可以重复?不能重复
        String s3 = map.put("陈羽凡", "白百何");
        System.out.println(s3);
        System.out.println(map);

        System.out.println("-----------------------------------------------------------");
        //删除pgOne,返回对应的值
        String res1 = map.remove("pgOne");
        System.out.println(res1);
        System.out.println(map);

        //根据指定的键获取对应的值:
        String res2 = map.get("贾乃亮");
        System.out.println(res2);//李小璐

        System.out.println("==================================================");
        //是否包含指定的键
        boolean b1 = map.containsKey("陈羽凡");
        System.out.println(b1);

        //是否包含指定的值
        boolean b2 = map.containsValue("白百何");
        System.out.println(b2);

        //获取所有的键
        Set<String> keys = map.keySet();
        System.out.println("keys:"+keys);

        //获取所有的值:
        Collection<String> values = map.values();
        System.out.println(values);

        Set<Map.Entry<String, String>> set = map.entrySet();
        System.out.println("所有键值对对象:" + set);

        String p = map.put("罗志祥","佳丽三千");
        System.out.println(p);//null
        System.out.println(map);

    }
}
