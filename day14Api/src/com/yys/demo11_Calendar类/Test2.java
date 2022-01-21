package com.yys.demo11_Calendar类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/19/9:39
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        /*
            Calendar类的常用方法:
                - `public static Calendar getInstance()` 获取当前日期的日历对象
                - `public int get(int field)` 获取某个字段的值。
                  - 参数field:表示获取哪个字段的值,可以使用Calender中定义的常量来表示
                      - Calendar.YEAR : 年<br />
                      Calendar.MONTH ：月
                      <br />Calendar.DAY_OF_MONTH：月中的日期
                      <br />Calendar.HOUR：小时
                      <br />Calendar.MINUTE：分钟
                      <br />Calendar.SECOND：秒
                      <br />Calendar.DAY_OF_WEEK：星期
                - `public void set(int field,int value) `设置某个字段的值
                - `public void add(int field,int amount)`为某个字段增加/减少指定的值

              额外增加的方法:
                 `void setTime(Date date)`  使用给定的 Date 设置此 Calendar 的时间。
                 `boolean before(Object when) `判断此 Calendar 表示的时间是否在指定 Object 表示的时间之前，返回判断结果
                 boolean after(Object when)    `判断此 Calendar 表示的时间是否在指定 Object 表示的时间之后，返回判断结果
         */
        //创建当前时间的日历对象
        Calendar cal = Calendar.getInstance();

        //1.获取cal对象中年字段的值
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);//2021

        //2.获取cal对象中月字段的值
        int month = cal.get(Calendar.MONTH);
        System.out.println(month);

        //设置cal日历对象中年的字段为2028年;
        cal.set(Calendar.YEAR,2028);
        System.out.println(cal.get(Calendar.YEAR));//2028

        //为cal日历对象的年字段的值+1
        cal.add(Calendar.YEAR,1);
        System.out.println(cal.get(Calendar.YEAR));//2029

        //为cal日历对象中年的字段-8
        cal.add(Calendar.YEAR,-8);
        System.out.println(cal.get(Calendar.YEAR));//2021

        System.out.println("=============================================================");
        //创建当前时间的日历对象
        Calendar cal1 = Calendar.getInstance();

        //需求:获取1998-08-16对应的日历对象
        String birthdayStr = "1998年08月16日";
        //2.把字符串转换成Date类型的日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthdayStr);
        //调用cal的setTime方法,传入日期对象
        cal.setTime(date);
        //获取
        System.out.println("年:"+cal.get(Calendar.YEAR));
        System.out.println("月:"+(cal.get(Calendar.MONTH)+1));
        System.out.println("日:"+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("--------------------------------------------------------");

        Calendar cal2 = Calendar.getInstance();
        System.out.println("cal1表示的时间是否在cal2表示的时间之前:"+cal1.before(cal2));
        System.out.println("cal1表示的时间是否在cal2表示的时间之后:"+cal1.after(cal2));
    }
}
