package com.yys.demo09_HashMap存储自定义类型;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/25/15:16
 */
public class Test {
    public static void main(String[] args) {
        /*
            HashMap存储自定义类型:前提:保证键的唯一性,要重写HashCode和equals方法
            特点:存取无序,键唯一
         */
        //1.创建HashMap集合
        HashMap<Student,String> map = new HashMap<>();
        //2.添加键值对
         //2.1创建Student对象
        Student stu1 = new Student("张三",18);//相当于map集合中的键
        Student stu2 = new Student("李四",18);//相当于map集合中的键
        Student stu3 = new Student("王五",18);//相当于map集合中的键
        Student stu4 = new Student("赵六",18);//相当于map集合中的键
        Student stu5 = new Student("田七",18);//相当于map集合中的键
        //2.2添加到map集合中
        map.put(stu1,"吴江");
        map.put(stu2,"昆山");
        map.put(stu3,"太仓");
        map.put(stu4,"常熟");
        map.put(stu5,"张家港");
        System.out.println(map);
        System.out.println(map.size());//5个
        //遍历
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();

        for (Map.Entry<Student, String> entry:entrySet){
            Student keys = entry.getKey();
            String values = entry.getValue();
            //略...
        }
    }
}
