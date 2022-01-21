package com.yys.test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yys.pojo.PeronListType;
import com.yys.pojo.Person;
import com.yys.pojo.PersonMapType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 夜遊神
 * @Date: 2022/01/05/9:55
 */
public class JsonTest {

    //JavaBean和Json对象的相互传递
    @Test
    public void test1(){
        //创建Person对象
        Person person = new Person(1,"法外狂徒张三");
        //创建gson对象实例
        Gson gson = new Gson();
        //将java对象转换成Json字符串 : toJson
        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);

        //将Json字符串转换成Java对象
        //第一个参数:json字符串  第二个参数就是 转换回去的Java对象类型
        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }

    //List和Json的互传
    @Test
    public void test2(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"法外狂徒张三"));
        personList.add(new Person(2,"罗翔教授"));
        //创建gson对象实例
        Gson gson = new Gson();
        //把list转换乘json字符串
        String s = gson.toJson(personList);
        //System.out.println(s);

        //Json字符串转换成List集和
        //List<Person> list = gson.fromJson(s,new PeronListType().getType());
        List<Person> list  = gson.fromJson(s, new TypeToken<ArrayList<Person>>() {
        }.getType());
        System.out.println(list);
        System.out.println(list.get(0));
    }

    //map和json互转
    @Test
    public void test3(){
        Map<Integer,Person> personMap = new HashMap<>();
        personMap.put(1,new Person(1,"法外狂徒张三"));
        personMap.put(2,new Person(2,"罗翔教授"));
        Gson gson = new Gson();
        //map转换成字符串
        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);

        //json字符串转换成Map对象
        //Map<Integer,Person> map = gson.fromJson(personMapJsonString, new PersonMapType().getType());
        Map<Integer,Person> map = gson.fromJson(personMapJsonString, new TypeToken<HashMap<Integer, Person>>() {
        }.getType());
        System.out.println(map);
        System.out.println(map.get(1));
    }

}
