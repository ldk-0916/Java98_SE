package com.yys06;

/**
 有返回值的方法调用方式
 1.赋值调用: 把有返回值的方法的调用结果保存到对应的变量中              ----推荐使用----
 数据类型 变量名称 = 方法名称(参数...);

 2.输出/打印调用: 把有返回值的方法的调用结果直接交给输出语句
 System.out.println(方法名称(参数...));

 3.单独调用: 既不保存方法的结果,也没有对结果进行输出                   -----不推荐使用
 */
public class Demo01DYMethod {
    public static void main(String[] args) {
        //赋值调用
        int result = getNum(10, 110);
        System.out.println("结果:" + result);

        //输出打印调用:直接交给输出语句来操作
        System.out.println(getNum(10,20));

        //单独调用
        getNum(5,10);

    }
    //定义方法,获取两个int数据之和
    public static int getNum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
