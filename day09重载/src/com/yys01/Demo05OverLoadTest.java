package com.yys01;

/**
 需求:
 使用方法重载的思想，设计比较两个数据是否相等的方法，兼容全整数类型(byte,short,int,long）

 实现步骤:
 1.使用方法重载的思想,定义比较两个byte数据的方法compare
 2.使用方法重载的思想,定义比较两个short数据的方法compare
 3.使用方法重载的思想,定义比较两个int数据的方法compare
 4.使用方法重载的思想,定义比较两个long数据的方法compare
 5.分别调用以上四个方法

 使用方法重载的思想,定义比较两个byte数据是否相同的方法compare
 */
public class Demo05OverLoadTest {
    public static void main(String[] args) {
        System.out.println(compare(10,20));//调用的int
        System.out.println(compare((byte)10,(byte)10));//大转小发生强制转换
        System.out.println(compare((short) 10,(short)15));
        System.out.println(compare( 10L, 20L));//小转大,自动转换
    }
    public static boolean compare(byte a,byte b){
        //byte类型比较
        System.out.println("两个byte比较...");
        boolean result = (a == b) ? true : false;
        return result;
    }
    public static boolean compare(short a,short b){
        System.out.println("两个short比较...");
        if (a == b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean compare(int a,int b){
        System.out.println("两个int比较...");
        return (a == b);
    }

    public static boolean compare(long a,long b){
        System.out.println("两个long比较...");
        return a == b;
    }
}
