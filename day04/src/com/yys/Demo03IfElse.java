package com.yys;

/**
 英文单词if是: 如果的意思
 英文单词else是: 否则的意思
 1.if语句的第二种格式:
 if(布尔表达式){
 语句体1;
 } else {
 语句体2;
 }
 其它语句;

 2.执行流程:
 (1)使用计算if后面()中布尔表达式的结果,看是true,还是false
 (2)如果if后面()中布尔表达式的结果是true,执行if后面{}中的语句体1,接着执行其它语句
 (3)如果if后面()中布尔表达式的结果是false,执行else后面{}中的语句体2,接着执行其它语句

 3.注意:
 (1)if语句的第二种格式,适用于有两种情况的场景
 (2)if后面()中表达式不管写的多么简单或者多么复杂,最终的结果一定是布尔类型,要么是true,要么是false
 (3)语句体1和语句体2,只有一个会被执行
 (4)适用于二选一的场景(是与否的场景)

 */
public class Demo03IfElse {
    public static void main(String[] args) {
        int a = 10, b = 20;
        if (a > b){//如果a>b条件成立
            //语句体1.
            System.out.println(a+"的值大于"+b);
        }else {
            //如果条件不成立,执行语句体2
            System.out.println(a+"的值小于"+b);
        }
        System.out.println("其他语句...end");
    }
}
