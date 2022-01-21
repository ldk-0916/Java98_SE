package com.yys.forxh;

/**
 需求:
 在控制台输出1-5和5-1的数据
 */
public class Demo02ForPrint {
    public static void main(String[] args) {
        //输出1-5
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        System.out.println("===========分割线==================");
        for (int j = 5; j >=1; j-- ){
            System.out.println(j);
        }
    }
}
