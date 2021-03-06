package com.yys;

/**
 英文单词if是: 如果的意思
 1.if语句的第一种格式:
 if(布尔表达式){
 语句体;
 }
 其它语句;

 2.执行流程:
 (1)使用计算if后面()中布尔表达式的结果,看是true,还是false
 (2)如果if后面()中布尔表达式的结果是true,执行if后面{}中的语句体,接着执行其它语句
 (3)如果if后面()中布尔表达式的结果是false,跳过if后面{}中的语句体,直接执行其它语句

 3.注意:
 (1)if语句的第一种格式,适用于有一种情况的场景
 (2)if后面()中表达式不管写的多么简单或者多么复杂,最终的结果一定是布尔类型,要么是true,要么是false
 (3)if后面{}中的语句体,要么执行(布尔表达式结果为true)要么不执行(布尔表达式结果为false)
 (4)if后面{}中的语句体: 一条或者多条语句(每条语句末尾处使用分号结尾)
 (5)if后面{}中的语句体的语句体只有一条语句,此时{}可以省略,但是初学者建义保留

 练习
 需求1：判断a和b的值是否相等，如果相等，就在控制台输出：a等于b
 需求2：判断a和c的值是否相等，如果相等，就在控制台输出：a等于c
 */
public class Demo02If {
    public static void main(String[] args){
        //需求1：判断a和b的值是否相等，如果相等，就在控制台输出：a等于b
        int a = 10, b = 20;
        if (a == b){
            System.out.println(a + "等于" + b);
        }

        if (a != b){
            System.out.println("a" + "不等于" + "b");
        }

        //需求2：判断a和c的值是否相等，如果相等，就在控制台输出：a等于c
        int c = 30;
        if (a == c){
            System.out.println(a + "等于" + c);
        }

        if (a != c){
            System.out.println("a" + "不等于" + "c");
        }
    }
}
