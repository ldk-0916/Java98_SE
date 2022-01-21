package com.yys06;

/**
 无返回值的方法调用方式

 1.单独调用: 既不保存方法的结果,也没有对结果进行输出            只能采用单独调用
 方法名称(参数...);

 System.out.println(方法名称(参数...));
 */
public class Demo02DYMethod {
    public static void main(String[] args) {
        //单独调用
        getSum(10,20);

    }
    public static void getSum(int a,int b){
        int sum = a + b;
        System.out.println("结果:"+sum);
    }

}
