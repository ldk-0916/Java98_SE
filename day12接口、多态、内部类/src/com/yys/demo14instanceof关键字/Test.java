package com.yys.demo14instanceof关键字;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/12/14:03
 */
public class Test {
    public static void main(String[] args) {
        /*
               instanceof关键字:
                为什么要有instanceof关键字?
                    因为在引用类型转换的时候很容易出现类型转换异常,所以为了提高代码的严谨性,转型之前得先判断一下
                怎么使用instanceof关键字判断呢?
                    if(变量名 instanceof 数据类型){
                    }
                 执行:
                    判断前面变量指向的对象类型是否是后面的数据类型:
                        如果前面变量指向的对象类型是属于后面的数据类型,那么就返回true
                        如果前面变量指向的对象类型不是属于后面的数据类型,那么就返回false
         */
        //向上转型
        Animal anl = new Cat();

        //向下转型
        //Dog d1 = (Dog)anl;//运行时会出现类型转换异常
        //先判断,在转换
        if (anl instanceof Dog){
            Dog dog = (Dog)anl;
        }
        System.out.println(anl instanceof Dog);
        System.out.println("GameOver...");
    }
}
