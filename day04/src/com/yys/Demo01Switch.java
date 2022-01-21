package com.yys;

/**
 1.switch语句的格式:
 switch(表达式) {
 case 常量值1;
 语句体1;
 break;
 case 常量值2;
 语句体2;
 break;
 ...
 case 常量值n;
 语句体n;
 break;
 default:
 语句体n+1;
 break;//可以省略
 }
 其它语句;

 2.执行流程:
 首先计算出表达式的值
 其次，和case依次比较，一旦有对应的值，就会执行相应的语句，在执行的过程中，遇到break就会结束。
 最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉。

 3.注意事项:
 (1)break的作用是用来结束switch语句的,一旦执行break,直接跳出到switch外面的其它语句继续执行
 (2)switch后面()中的表达式的数据类型,只能是以下几种类型:
 基本类型: byte/short/char/int 都可以   -----------------重要,选择题经常考到---------------
 引用类型: String或者枚举
 (3)case 后面只能写常量,而且常量值不能重复
 (4)最后一个default的作用:
 用来兜底的,如果所有的case后面的常量值和switch中表达式的值都不相同,就执行default中的内容
 (5)如果default放在最后的话: 后面的break可以省略
 (6)如果所有的case和default后面都有break,那么default和case的顺序可以任意排列,不影响最终的结果
 */
public class Demo01Switch {
    public static void main(String[] args){
        int choose = 1;
        switch (choose){//条件

            case 1://3:常量值(case后面跟的)
                System.out.println("你好...");
                break;
            case 2:
                System.out.println("我是错误的...");
                break;
            default:
                System.out.println("我是默认的...");
                break;//可以省略
        }
    }
}
