package com.yys.demo06_equals方法;

import java.util.Objects;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/11:25
 */
public class Person extends Object {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
  /*  @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.age == p.age && this.name == p.name;
    }*/

    @Override
    public boolean equals(Object o) {
        //如果两个对象的地址值相同,就返回true,结束方法;
        if (this == o) return true;
        //如果传入的对象为null,直接返回false
        if (o == null || getClass() != o.getClass()) return false;

        //比较2个对象的地址值不同,并且一定是Person类型
        Person person = (Person) o;//向下转型(大转小)
        //比较属性
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}
