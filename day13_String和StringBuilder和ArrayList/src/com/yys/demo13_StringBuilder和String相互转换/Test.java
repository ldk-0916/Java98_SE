package com.yys.demo13_StringBuilder和String相互转换;

/**
 * @Author: 夜遊神
 * @Date: 2021/10/14/13:58
 */
public class Test {
    public static void main(String[] args) {
        /*
            StringBuilde和String相互转换
                String --->StringBuilder public StrngBuilder(String str)
                StringBuilder --->String public String toString()
         */
        String str = "Hello-yys";
        StringBuilder sb1 = new StringBuilder(str);//string-->stringbuilde

        // StringBuilder --->String public String toString()
        String s = sb1.toString();
        System.out.println(sb1);//Hello-yys :可变字符串
        System.out.println(s);//Hello-yys  :不可变字符串
    }
}
