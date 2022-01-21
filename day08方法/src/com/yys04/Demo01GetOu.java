package com.yys04;

/**
 需求:
 定义一个方法，该方法接收一个int参数，判断该数据是否是偶数，并返回真假值

 方法是否需要返回值:
       1.如果方法中能够明确看到 打印/输出 这样的字眼,说明方法不需要返回值,使用void返回值类型就行
       2.如果方法中能够明确看到 获取/返回/判断 这样的字眼,说明该方法需要返回值,必须定义具体的返回值类型
 */
public class Demo01GetOu {
    public static void main(String[] args) {
        boolean s = getOu(11);
        System.out.println("11是偶数吗:" + s);
    }
    public static boolean getOu(int num){
        boolean result = (num % 2 == 0) ? true : false;
        return result;
    }
}
