package com.utils;

import com.domain.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/20/9:36
 */
public class Utils {
    //定义学生的id静态变量
    public static int sid;
    public static int tid;

    static {
        //给sid赋初始值,可以从文件中读取记录的id值,作为初始值
        sid = 0;
        //同理...
        tid = 0;
    }

    /**
     * 根据生日计算年龄
     */
    public static int birthdayToAge(String birthday){
        if (birthday == null){
            return -1;
        }

        /*
            分析:添加一条数据,输入年龄,一般的都是:1999-10-01
         */
        //把字符串类型转换成date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //解析日期
        Date birthdayDate = null;
        try {
            birthdayDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //解析完日期,进行判断
        if (birthdayDate.after( new Date())){
            return -1;//标识
        }

        //1.获取当前日历对象
        Calendar cal = Calendar.getInstance();
        //2.获当前取年,月,日
        int nowYear = cal.get(Calendar.YEAR);
        int nowMonth = cal.get(Calendar.MONTH);
        int nowDay = cal.get(Calendar.DAY_OF_MONTH);
        //3.把Date类型的生日转换成日历对象
        cal.setTime(birthdayDate);
        //4.获取出生日期的年,月,日
        int birthdayYear = cal.get(Calendar.YEAR);
        int birthdayMonth = cal.get(Calendar.MONTH);
        int birthdayDday = cal.get(Calendar.DAY_OF_MONTH);

        //5.计算初步年龄
        int age = nowYear - birthdayYear;

        //6.判断生日是否已经过了
        //如果生日月份大于当前月份,那么年龄-1
        if (birthdayMonth > nowMonth){
            age--;
        }
        //如果等于...
        if (birthdayMonth == nowMonth){
            if (birthdayDday > nowDay){
                age--;
            }
        }
        //返回年龄
        return age;
    }

    /**
     * 打印Person对象
     */
    public static void printPerson(Person p){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t年龄\t\t描述");
        System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getSex()+"\t\t"+
                p.getBirthday()+"\t\t"+p.getAge()+"\t\t"+p.show());
        System.out.println("-----------------------------------------------------------------------");
    }

    /**
     * 打印一个ArrayList<Person>集合的方法
     */
    public static void printArrayList(ArrayList list){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t年龄\t\t描述");
        for (int i = 0; i < list.size(); i++) {
            //获取元素
            Person p = (Person) list.get(i);
            System.out.println(p.getId()+"\t\t"+p.getName()+"\t\t"+p.getSex()+"\t\t"+
                    p.getBirthday()+"\t\t"+p.getAge()+"\t\t"+p.show());
        }
        System.out.println("-----------------------------------------------------------------------");
    }
}
