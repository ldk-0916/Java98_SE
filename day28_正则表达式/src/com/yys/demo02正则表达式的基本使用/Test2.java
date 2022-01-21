package com.yys.demo02正则表达式的基本使用;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/25/9:52
 */
public class Test2 {
    public static void main(String[] args) {
        /*
            正则表达式-逻辑运算符
                - 语法示例：
                  1. &&：并且
                  2. |    ：或者
         */
        String str = "haved";
        //要求字符串是小写辅音字符开头，后跟ave 除了a,e,i,o,u之外,其他的都是辅音字母
        System.out.println(str.matches("[a-z&&[^aeiou]]aved"));//true
        System.out.println("asd".matches("[a-z&&[^aeiou]]sd"));//false
        System.out.println("-----------------------------");
        System.out.println();
        //2.要求字符串是aeiou中的某个字符开头，后跟ad
        System.out.println("aad".matches("[a|e|i|o|u]ad"));//true
        System.out.println(str.matches("[a|e|i|o|u]ad"));//false
    }
}
