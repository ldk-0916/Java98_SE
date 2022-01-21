package com.yys.demo01_单列集合常用类的继承体系;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/21/9:23
 */
public class Test {
    public static void main(String[] args) {
        /*
          单列集合常用类的继承体系:
                Collection集合:接口,是所有单列集合的顶层父接口,该集合中的方法可以被所有单列集合共享
                    List集合: 接口,元素可重复,元素有索引,元素存取有序
                        ArrayList集合: 实现类,查询快,增删慢
                        LinkedList集合: 实现类,查询慢,增删快

                    Set集合: 接口, 元素不可重复(唯一),元素无索引
                        HashSet集合: 实现类,元素存取无序
                        LinkedHashSet集合:实现类,元素存取有序
                        TreeSet集合:实现类,可以对集合中的元素进行排序

                  public boolean add(E e)`：  把给定的对象添加到当前集合中 。
                - public void clear()` :清空集合中所有的元素。
                - public boolean remove(E e)`: 把给定的对象在当前集合中删除。
                - public boolean contains(Object obj)`: 判断当前集合中是否包含给定的对象。
                - public boolean isEmpty()`: 判断当前集合是否为空。
                - public int size()`: 返回集合中元素的个数。
                - public Object[] toArray()`: 把集合中的元素，存储到数组中
         */
        //1.创建Collection集合对象,限制集合泛型元素为String类型
        Collection<String> col = new ArrayList<>();
        //添加元素,:往Collection集合中添加
        col.add("郭德纲");
        col.add("于谦");
        col.add("岳云鹏");
        col.add("孙岳");
        col.add("秦霄贤");
        System.out.println(col);
        //2.清空集合中所有元素
        /*col.clear();
        System.out.println("col集合:"+col);*/

        //3.把给定的对象在当前集合中删除。
        col.remove("孙岳");
        System.out.println(col);

        //4.判断当前集合中是否包含给定的对象。
        boolean res1 = col.contains("张鹤伦");
        System.out.println(res1);//false

        //5. 判断当前集合是否为空。
        boolean res2 = col.isEmpty();
        System.out.println(res2);//false

        //6.返回集合中元素的个数。
        int res3 = col.size();
        System.out.println(res3);//4

        //7. 把集合中的元素，存储到数组中
        Object[] arr = col.toArray();
        System.out.println(arr);//[Ljava.lang.Object;@1540e19d地址值
        System.out.println(Arrays.toString(arr));

    }
}
