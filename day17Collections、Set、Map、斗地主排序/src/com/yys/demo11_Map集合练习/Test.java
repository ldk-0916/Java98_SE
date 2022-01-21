package com.yys.demo11_Map集合练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/15:40
 */
public class Test {
    public static void main(String[] args) {
        /*
            输入一个字符串统计该字符串中每个字符出现次数。
         */
        //1.键盘录入类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();

        //2.创建Map集合,键代表字符,值代表次数
        Map<Character,Integer> map = new HashMap<>();

        //3.遍历获取每个字符串
        for (int i = 0; i < s.length(); i++) {
            //3.1获取遍历出来的字符串,
            char c = s.charAt(i);
            //3.2判断map中是否有该键
            if (map.containsKey(c)){
                //如果存在该字符串的键,那么就取出对应的值,然后自增+1,变成新的值,重新存储到集合中
                Integer value = map.get(c);
                value ++;
                map.put(c,value);
            }else{
                //不存在
                map.put(c,1);
            }
        }
        System.out.println(map);

    }
}
