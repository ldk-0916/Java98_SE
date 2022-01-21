package com.yys.demo09_DateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/18/16:33
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        /*
            DateFormat类:
                概述:java.text.DateFormat 是日期/时间格式化子类的抽象类，我们通过这个类可以帮我们完成日期和文本之间的转换,
                也就是可以在Date对象与String对象之间进行来回转换。
                作用:完成日期和文本之间的转换
                特点:由于DateFormat为抽象类，不能直接使用，所以需要常用的子类java.text.SimpleDateFormat。这个类需要一个模式（格式）来指定格式化或解析的标准
                SimpleDateFormat类:
                    概述:java.text.SimpleDateFormat 是日期/时间格式化的类
                    作用:可以在Date对象与String对象之间进行来回转换
                参数: 日期格式,不管是格式化还是解析都是通过参数指定的格式来操作
                日期格式:
                           y   年
                           M   月
                           d   日
                           H   时
                           m   分
                           s   秒
                           ...
                       常见的日期格式:  yyyy年MM月dd日 HH时mm分ss秒
                       常见的日期格式:  yyyy-MM-dd HH:mm:ss
                       常见的日期格式:  yyyy-MM-dd
                       常见的日期格式:  HH:mm:ss
  成员方法:
         public String format(Date date)：将Date对象格式化为字符串。
         public Date parse(String source)：将字符串解析为Date对象。
         */
        //1.需求:把Date类型的转换成String类型
        //创建当前日期对象
        Date date1 = new Date();

        //创建日期格式化对象,并且指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式化

        //使用日期格式化对象,把日期转换成String对象
        String dateStr = sdf.format(date1);
        System.out.println(dateStr);//2021-10-18 16:47:57
        System.out.println("------------------------------------------------");

        //需求2:把String类型转换成Date类型
        //创建一个日期字符串对象
        String str = "2021年10月18日 12时00分00秒";
        //创建日期格式化对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //解析
        Date date = sdf1.parse(str);
        System.out.println(date);

    }
}
