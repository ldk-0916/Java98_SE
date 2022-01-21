package com.yys.demo15static关键字修饰成员变量;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/09/14:56
 */
public class Test {
    public static void main(String[] args) {
        /*
            static 关键字:
                概述:静态修饰符关键字,表示静态的意思,可以修饰成员变量和成员方法以及代码块
                作用:
                    修饰成员变量:static 数据类型 变量名;
                    特点:被static修饰的成员变量属于类的(静态变量\类变量),会被该类的所有对象共享
                    访问:
                        对象名.静态成员变量名; 不推荐
                        类名.静态成员变量名;   推荐
                     注意:1.静态成员只会随着类的加载而加载,而且只会加载一次
                          2.静态成员会存放在静态区
         */
        //使用static修饰的country成员变量
        //创建对象
        ChinesePeople p1 = new ChinesePeople("罗翔","中国");//@541
        System.out.println("姓名:"+p1.name+":"+"国籍:"+p1.country);

        //ChinesePeople p2 = new ChinesePeople("张三","台湾");
        //System.out.println("姓名:"+p2.name+":"+"国籍:"+p2.country);//null,null(中国)

        ChinesePeople p3 = new ChinesePeople();
        System.out.println("姓名:"+p3.name+":"+"国籍:"+p3.country);
    }
}
