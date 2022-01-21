package com.yys;

/**
 * @Author: 夜遊神
 * @Date: 2021/11/02/9:09
 */
public class Test2_3{
    public static void main(String[] args){
        /*
           请给代码加上异常处理，使得在有异常的情况下，程序依然能够向下执行
         */
        //测试调用：会导致方法内抛出“空指针异常”

        try {
            int n1 = getMax(null);
        } catch (Exception e) {
        }
        //测试调用：会导致方法内抛出“数组索引越界异常”
        int[] arr = new int[0];
        try {
            int n2 = getMax(arr);
        } catch (Exception e) {
        }
        //测试调用：正常
        int[] arr2 = {1,2,4,24,32,5324,32};
        int n3 = getMax(arr2);

        System.out.println("程序继续执行");
    }
    //获取数组最大值
    public static int getMax(int[] args){
            int max = args[0];
            for(int i = 1 ; i < args.length ; i++){
                if(max < args[i]){
                    max = args[i];
                }
            }
            return max;

    }
}
